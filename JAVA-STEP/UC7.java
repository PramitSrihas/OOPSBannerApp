public class UC7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patternMaps = {

            new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "****** ",
                    "*     *",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      ",
                    "*      "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            })
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = getCharacterPattern(patternMaps, ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}
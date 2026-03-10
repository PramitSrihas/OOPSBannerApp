import java.util.HashMap;
import java.util.Map;

public class UC8 {

    
    static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  ***  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "  ***  "
        });

        patternMap.put('P', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*******",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                "*******",
                "*      ",
                "*      ",
                "*******",
                "      *",
                "      *",
                "*******"
        });

        return patternMap;
    }

    
    static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        renderBanner("OOPS", patternMap);
    }
}
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    void main() {
        String s1 = "Cats";
        String s2 = "stacK";
        System.out.println(anagrams(s1, s2));
    }

    public static boolean anagrams(String s1, String s2) {
        Map<Character, Integer> count1 = charCount(s1);
        Map<Character, Integer> count2 = charCount(s2);
        return count1.equals(count2);
    }

    public static Map<Character, Integer> charCount(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toLowerCase().toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        return count;
    }
}
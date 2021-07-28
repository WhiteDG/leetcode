package cc.white.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author White
 */
public class ValidAnagram {

    public static void main(String[] args) {
        var anagram = isAnagram("anagramx", "xnagaram");
        System.out.println(anagram);
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < t.length(); i++) {
            var num = map.get(t.charAt(i));
            if (num == null || num == 0) {
                return false;
            } else {
                map.put(t.charAt(i), num - 1);
            }
        }
        return true;
    }
}

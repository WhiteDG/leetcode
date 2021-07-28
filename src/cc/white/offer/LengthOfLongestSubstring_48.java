package cc.white.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author White
 */
public class LengthOfLongestSubstring_48 {

    public static void main(String[] args) {
        var substring = lengthOfLongestSubstring("abcabcbb");
        System.out.println(substring);
    }

    private static int lengthOfLongestSubstring(String s) {
        var chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            var b = map.containsKey(chars[i]);
            if (b) {
                start = Math.max(start, map.get(chars[i]));
            }
            max = Math.max(max, i - start + 1);
            map.put(chars[i], i + 1);
        }
        return max;
    }
}

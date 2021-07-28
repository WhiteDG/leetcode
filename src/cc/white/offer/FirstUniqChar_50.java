package cc.white.offer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 *
 * @author White
 */
public class FirstUniqChar_50 {

    public static void main(String[] args) {
        char uniqChar = firstUniqChar("abaccdeff");
        System.out.println(uniqChar);
        uniqChar = firstUniqChar("abaccddeebff");
        System.out.println(uniqChar);
    }

    private static char firstUniqChar(String s) {
        Map<Character, Boolean> charNumMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charNumMap.put(c, !charNumMap.containsKey(c));
        }
        Set<Map.Entry<Character, Boolean>> entries = charNumMap.entrySet();
        for (Map.Entry<Character, Boolean> entry : entries) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return ' ';
    }
}

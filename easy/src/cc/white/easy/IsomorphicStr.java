package cc.white.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/24
 *     time   : 15:58
 *     desc   : https://leetcode-cn.com/problems/isomorphic-strings/description/
 * </pre>
 */
public class IsomorphicStr {

    public static void main(String[] args) {
        boolean isomorphic = isIsomorphic("adgf", "efgf");
        System.out.println(isomorphic);
    }

    /**
     * 给定两个字符串 s 和 t，判断它们是否是同构的。
     * <p>
     * 如果 s 中的字符可以被替换最终变成 t ，则两个字符串是同构的。
     * <p>
     * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
     * <p>
     * 例如，
     * <p>
     * 给定 "egg", "add", 返回 true.
     * <p>
     * 给定 "foo", "bar", 返回 false.
     * <p>
     * 给定 "paper", "title", 返回 true.
     * <p>
     * 注意：
     * <p>
     * 你可以假设 s 和 t 具有相同的长度。
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // char 的取值范围 -127 ~ 128
        int maxChar = 256;
        char[] maps = new char[maxChar];
        char[] mapt = new char[maxChar];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // 两个字符都未出现过，保存进数组
            if (maps[sChar] == 0 && mapt[tChar] == 0) {
                maps[sChar] = tChar;
                mapt[tChar] = sChar;
                continue;
            }
            // 两个字符互相对应上了
            if (maps[sChar] == tChar && mapt[tChar] == sChar) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean isIsomorphicWithMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (!map.containsKey(cs)) {
                if (map.containsValue(ct)) {
                    return false;
                } else {
                    map.put(cs, ct);
                }
            } else {
                if (map.get(cs) != ct) {
                    return false;
                }
            }
        }
        return true;
    }
}

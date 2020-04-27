package cc.white.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author White
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * https://leetcode-cn.com/problems/is-unique-lcci/
 */
public class IsUnique {
    public static void main(String[] args) {
        boolean leetcode = isUnique("leetcode");
        System.out.println(leetcode);
        boolean abc = isUnique("abc");
        System.out.println(abc);
    }

    public static boolean isUnique(String astr) {
        int length = astr.length();
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            char c = astr.charAt(i);
            if (characters.contains(c)) {
                return false;
            }
            characters.add(c);
        }
        return true;
    }
}

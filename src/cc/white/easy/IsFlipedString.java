package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/string-rotation-lcci/
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成
 * （比如，waterbottle是erbottlewat旋转后的字符串）。
 * 输入：s1 = "waterbottle", s2 = "erbottlewat"
 * 输出：True
 */
public class IsFlipedString {
    public static void main(String[] args) {
        boolean flipedString = isFlipedString0("waterbottle", "erbottlewat");
        System.out.println(flipedString);
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.length() <= 1) {
            return true;
        }
        for (int i = 1; i < s1.length(); i++) {
            String s = s1.substring(i) + s1.substring(0, i);
            if (s.equals(s2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFlipedString0(String s1, String s2) {
        return s1 != null && s2 != null && (s1.length() == s2.length())
                && (s1 + s1).contains(s2);
    }
}

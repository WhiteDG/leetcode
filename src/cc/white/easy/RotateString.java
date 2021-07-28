package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/rotate-string/
 */
public class RotateString {

    public static void main(String[] args) {
        var b = rotateString("abcde", "cdeab");
        System.out.println(b);
        b = rotateString("abcde", "abced");
        System.out.println(b);
    }

    private static boolean rotateString(String A, String B) {
        if (A.length() != B.length()) return false;
        return (A + A).contains(B);
    }
}

package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/21
 *     time   : 20:53
 *     desc   : https://leetcode-cn.com/problems/valid-palindrome/description/
 * </pre>
 */
public class PalindromeStr {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }

    /**
     * 给定一个字符串，确定它是否是回文，只考虑字母数字字符和忽略大小写。
     * 例如：
     * "A man, a plan, a canal: Panama" 是回文字符串。
     * "race a car" 不是回文字符串。
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        // 忽略大小写
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ) {
            // 获取首尾字符
            char l = chars[i];
            char r = chars[j];
            // 不需要判定的跳过
            if (!(l >= 'a' && l <= 'z') && !(l >= '0' && l <= '9')) {
                i++;
                continue;
            }
            if (!(r >= 'a' && r <= 'z') && !(r >= '0' && r <= '9')) {
                j--;
                continue;
            }
            if (l != r) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

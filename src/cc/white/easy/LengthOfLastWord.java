package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 17:58
 *     desc   : https://leetcode-cn.com/problems/length-of-last-word/description/
 * </pre>
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        int i = lengthOfLastWord("b   a    ");
        System.out.println(i);
    }

    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int length = 0;
        for (int i = 0, len = s.length(); i < len; i++) {
            if (s.charAt(i) == ' ') {
                if (i != len - 1 && s.charAt(i + 1) != ' ') {
                    length = 0;
                }
            } else {
                length++;
            }
        }
        return length;
    }
}

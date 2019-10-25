package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 18:50
 *     desc   : https://leetcode-cn.com/problems/plus-one/description/
 * </pre>
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] plusOne = plusOne(new int[]{0});
    }

    public static int[] plusOne(int[] digits) {
        int p = digits.length - 1;
        if (digits[p] < 9) {
            digits[p] = ++digits[p];
        } else {
            do {
                digits[p--] = 0;
            } while (p >= 0 && digits[p] == 9);
            if (digits[0] != 0) {
                ++digits[p];
            } else {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
        }
        return digits;
    }
}

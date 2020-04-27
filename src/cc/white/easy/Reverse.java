package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/15
 *     time   : 22:56
 *     desc   : https://cn.leetcode.com/problems/reverse-integer/description/
 * </pre>
 */
public class Reverse {

    public static void main(String[] args) {
        int reverse = reverse(-2147483648);
        System.out.println("result:" + reverse);
    }

    /**
     * 给定一个范围为 32 位 int 的整数，将其颠倒。
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;

//        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs((long) x)));
//        String reverseStr = sb.reverse().toString();
//        long longVal = Long.parseLong(reverseStr);
//        return longVal > Integer.MAX_VALUE ? 0 : Math.toIntExact(x < 0 ? -longVal : longVal);
    }
}

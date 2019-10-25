package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 21:58
 *     desc   :
 * </pre>
 */
public class ClimbStairs {

    public static void main(String[] args) {
        int i = climbStairs(10);
        System.out.println(i);
    }

    public static int climbStairs(int n) {
        int a = 1, b = 1;
        while (--n > 0) {
            b += a;
            a = b - a;
        }
        return b;
    }

    /**
     * 动态规划：到达第 i 层的方法等于到达第 i-1 和 第 i-2 层方法的总和
     * @param n
     * @return
     */
    public static int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        }
        int[] temp = new int[n + 1];
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i <= n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[n];
    }
}

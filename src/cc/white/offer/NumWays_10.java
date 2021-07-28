package cc.white.offer;

/**
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 *
 * @author White
 */
public class NumWays_10 {

    public static void main(String[] args) {
        int i = numWays(2);
        System.out.println(i);
        i = numWays(7);
        System.out.println(i);
        i = numWays(0);
        System.out.println(i);
    }

    private static int numWays(int n) {
//        if (n <= 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        return numWays(n - 1) + numWays(n - 2);
        int n0 = 1, n1 = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (n0 + n1) % 1000000007;
            n0 = n1;
            n1 = sum;
        }
        return n0;
    }
}

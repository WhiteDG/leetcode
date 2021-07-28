package cc.white.offer;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 *
 * @author White
 */
public class Fib_10 {

    public static void main(String[] args) {
        int fib = fib0(5);
        System.out.println(fib);
    }

    private static int fib(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//        int num1 = 1, num2 = 0, sum = 0;
//        while (n >= 2) {
//            sum = (num1 + num2) % 1000000007;
//            num2 = num1;
//            num1 = sum;
//            n--;
//        }
//        return num1;
        // 滚动数组
        int p = 0, q = 1, r = 0;
        for (int i = 0; i < n; i++) {
            r = (p + q) % 1000000007;
            p = q;
            q = r;
        }
        return p;
    }

    /**
     * 递归法，存在重复计算的问题
     *
     * @param n
     * @return
     */
    private static int fib0(int n) {
        if (n <= 1) {
            return n;
        }
        return fib0(n - 1) + fib0(n - 2);
    }

    private static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}

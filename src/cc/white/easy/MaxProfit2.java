package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/20
 *     time   : 21:54
 *     desc   : https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 * </pre>
 */
public class MaxProfit2 {

    public static void main(String[] args) {
        int maxProfit = maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
        int maxProfit2 = maxProfit2(new int[]{7, 6, 4, 3, 1});
        System.out.println(maxProfit);
        System.out.println(maxProfit2);
    }

    /**
     * 暴力法
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    max = Math.max(max, prices[j] - prices[i]);
                }
            }
        }
        return max;
    }

    /**
     * 一次遍历
     * 我们需要找到最小的谷之后的最大的峰。
     * 我们可以维持两个变量——minprice 和 maxprofit，
     * 它们分别对应迄今为止所得到的最小的值和最大的利润（卖出价格与最低价格之间的最大差值）。
     *
     * @param prices
     * @return
     */
    public static int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}


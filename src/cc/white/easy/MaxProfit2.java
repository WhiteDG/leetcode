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

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     */
    public static void main(String[] args) {
        int maxProfit = maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
        int maxProfit2 = maxProfit2(new int[]{7, 6, 4, 3, 1});
        System.out.println(maxProfit);
        System.out.println(maxProfit2);
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
        int i = 0;
        int bottom;
        int top;
        int max = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            bottom = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            top = prices[i];
            max += top - bottom;
        }
        return max;
    }
}


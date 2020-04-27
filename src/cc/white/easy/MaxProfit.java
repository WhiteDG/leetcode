package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/20
 *     time   : 21:54
 *     desc   : https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/description/
 * </pre>
 */
public class MaxProfit {

    public static void main(String[] args) {
        int maxProfit = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        int maxProfit2 = maxProfit(new int[]{7, 6, 4, 3, 1});
        System.out.println(maxProfit);
        System.out.println(maxProfit2);
    }

    public static int maxProfit(int[] prices) {
        int max = 0, minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            // 记录最低值
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            max = Math.max(profit, max);
        }
        return max;
    }
}


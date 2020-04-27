package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/24
 *     time   : 13:54
 *     desc   : https://leetcode-cn.com/problems/house-robber/description/
 * </pre>
 */
public class HouseRobber {

    public static void main(String[] args) {
        int rob = rob(new int[]{1, 4});
        System.out.println(rob);
    }

    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        // 记录打劫到的最大值
        int[] max = new int[length];
        // 第一家
        max[0] = nums[0];
        // 第二家（从多的那家开始打劫）
        max[1] = Math.max(nums[0], nums[1]);
        // 第三家开始计算
        for (int i = 2; i < length; i++) {
            // 记录从相邻三家打劫到最多的钱，此时的上上家位置记录的是从0到上上家打劫到的总和
            max[i] = Math.max(max[i - 1], nums[i] + max[i - 2]);
        }
        return max[length - 1];
    }
}

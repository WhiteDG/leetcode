package cc.white.offer;

/**
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 *
 * @author White
 */
public class MaxSubArray {

    public static void main(String[] args) {
        var msa = maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(msa);
    }

    private static int maxSubArray(int[] nums) {
        int res = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i] + Math.max(temp, 0);
            res = Math.max(res, temp);
        }
        return res;
    }
}


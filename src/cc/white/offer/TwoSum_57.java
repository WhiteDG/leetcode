package cc.white.offer;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 *
 * @author White
 */
public class TwoSum_57 {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
        ints = twoSum(new int[]{2, 7, 11, 15}, 22);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int expectedRight = target - nums[left];
            if (expectedRight < nums[right]) {
                right -= 1;
            } else if (expectedRight > nums[right]) {
                left += 1;
            } else {
                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[0];
    }
}

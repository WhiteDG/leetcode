package cc.white.easy;

import java.util.Arrays;

/**
 * @author White
 * https://leetcode-cn.com/problems/missing-number/
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 0, 1};
        var missingNumber = missingNumber(nums);
        System.out.println(missingNumber);
        nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        missingNumber = missingNumber(nums);
        System.out.println(missingNumber);
    }

    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != i) {
                break;
            }
        }
        return i;
    }
}

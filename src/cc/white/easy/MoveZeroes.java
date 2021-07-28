package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left++] = temp;
            }
        }
    }
}

package cc.white.sort;

/**
 * @author White
 */
public class QuickSort {

    public static void main(String[] args) {

    }

    private static void quickSort(int[] nums) {
        int left = 0;
        int right = nums.length - 2;
        int basic = nums.length - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            while (nums[left] >= nums[basic] && left < nums.length - 1) {
                left++;
            }
            while (nums[right] <= nums[basic] && right > 0) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }
}

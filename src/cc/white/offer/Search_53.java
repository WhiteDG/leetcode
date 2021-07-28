package cc.white.offer;

/**
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 *
 * @author White
 */
public class Search_53 {

    public static void main(String[] args) {
        int i = searchLeftRight(new int[]{5, 7, 8, 8, 8, 9}, 8);
        System.out.println(i);
    }

    private static int search(int[] nums, int target) {
        int res = 0;
        for (int num : nums) {
            if (num == target) {
                res++;
            }
        }
        return res;
    }

    private static int searchLeftRight(int[] nums, int target) {
        int left = -1;
        int right = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                left = i;
                break;
            }
        }
        if (left == -1) {
            return 0;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                right = i;
                break;
            }
        }
        return right - left + 1;
    }
}

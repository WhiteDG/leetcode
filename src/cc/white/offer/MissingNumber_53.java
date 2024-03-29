package cc.white.offer;

/**
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 *
 * @author White
 */
public class MissingNumber_53 {

    public static void main(String[] args) {
        int i = missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9});
        System.out.println(i);
        i = missingNumber(new int[]{0, 1, 3});
        System.out.println(i);
        i = missingNumber(new int[]{0, 2});
        System.out.println(i);
        i = missingNumber(new int[]{1});
        System.out.println(i);
        i = missingNumber(new int[]{0});
        System.out.println(i);
    }

    private static int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

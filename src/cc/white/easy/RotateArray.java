package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/24
 *     time   : 13:35
 *     desc   :
 * </pre>
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        rotate(A, 2);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        // 反转数组
        reverse(nums, 0, nums.length - 1);
        // 反转k步
        reverse(nums, 0, k - 1);
        // 反转后置数组
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int s, int e) {
        for (int i = s, j = e; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

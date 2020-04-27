package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 17:12
 *     desc   :
 * </pre>
 */
public class SearchInsert {

    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 5, 6}, 0);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
//        int length = nums.length;
//        for (int i = 0; i < length; i++) {
//            if (nums[i] >= target) {
//                return i;
//            }
//        }
//        return length;

        int left = 0, right = nums.length - 1, mid = (right + left) >> 1;
        while (left <= right) {
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (right + left) >> 1;
        }
        return left;
    }
}

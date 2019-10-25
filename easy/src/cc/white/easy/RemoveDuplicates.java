package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 16:24
 *     desc   :
 * </pre>
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        int i = removeDuplicates(new int[]{1, 2, 3, 3, 5, 5, 6});
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return length;
        }
        int tail = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[tail++] = nums[i];
            }
        }
        return tail;
    }
}

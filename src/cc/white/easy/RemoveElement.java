package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 16:30
 *     desc   :
 * </pre>
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {1};
        int i = removeElement(nums, 1);
        System.out.println(i);
    }

    /**
     * 给定 nums = [3,2,2,3]，val = 3，
     * <p>
     * 你的函数应该返回 长度 = 2，数组的前两个元素是 2。
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int tail = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[tail++] = nums[i];
            }
        }
        return tail;
    }
}

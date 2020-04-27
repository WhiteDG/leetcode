package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/23
 *     time   : 22:39
 *     desc   : https://leetcode-cn.com/problems/majority-element/description/
 * </pre>
 */
public class MajorityElement {
    public static void main(String[] args) {
        int i = majorityElement(new int[]{1});
        System.out.println(i);
    }

    /**
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * <p>
     * 你可以假设数组是非空的，并且数组中的众数永远存在。
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int count = 0;
        int value = 0;
        for (int num : nums) {
            if (count == 0) {
                value = num;
                count = 1;
            } else if (value == num) {
                count++;
            } else {
                count--;
            }
        }
        return value;
    }
}

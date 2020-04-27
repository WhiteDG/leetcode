package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/23
 *     time   : 21:41
 *     desc   : https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 * </pre>
 */
public class TwoSum2 {

    public static void main(String[] args) {
        int[] twoSum = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int a : twoSum) {
            System.out.println(a);
        }
    }


    /**
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     * <p>
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。请注意，返回的下标值（index1 和 index2）不是从零开始的。
     * <p>
     * 你可以假设每个输入都只有一个解决方案，而且你不会重复使用相同的元素。
     * <p>
     * 输入：数组 = {2, 7, 11, 15}, 目标数 = 9
     * 输出：index1 = 1, index2 = 2
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int x = numbers[i] + numbers[j];
            if (x == target) {
                return new int[]{i + 1, j + 1};
            } else if (x < target) {
                // 小于目标值
                i++;
            } else {
                // 大于目标值
                j--;
            }
        }
        return new int[2];
    }
}

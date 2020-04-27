package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/21
 *     time   : 21:24
 *     desc   : https://leetcode-cn.com/problems/single-number/description/
 * </pre>
 */
public class SingleNumber {

    public static void main(String[] args) {
        int singleNumber = singleNumber(new int[]{2, 2, 3, 4, 3});
        System.out.println(singleNumber);
    }

    /**
     * 给定一个整数数组，除了某个元素外其余元素均出现两次。请找出这个只出现一次的元素。
     * 你的算法应该是一个线性时间复杂度。 你可以不用额外空间来实现它吗？
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        // 使用异或（^）来实现，因为相同的元素进行异或，其结果为0，
        // 所以当数组中的所有元素进行异或后，最后剩下的值就是只出现一次的那个值。
        int num = 0;
        for (int num1 : nums) {
            num ^= num1;
        }
        return num;
    }
}

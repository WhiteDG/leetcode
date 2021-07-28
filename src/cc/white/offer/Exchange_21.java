package cc.white.offer;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 *
 * @author White
 */
public class Exchange_21 {

    public static void main(String[] args) {
        int[] exchange = exchange1(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(exchange));
        exchange = exchange1(new int[]{3, 2, 4, 5, 1, 7, 8, 2});
        System.out.println(Arrays.toString(exchange));
    }

    private static int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int num : nums) {
            res[num % 2 == 0 ? right-- : left++] = num;
//            if (num % 2 == 0) {
//                res[right--] = num;
//            } else {
//                res[left++] = num;
//            }
        }
        return res;
    }

    private static int[] exchange1(int[] nums) {
        int left = 0, right = nums.length - 1, tmp;
        while (left < right) {
            while (left < right && (nums[left] % 2 == 1)) left++;
            while (left < right && (nums[right] % 2 == 0)) right--;
            tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return nums;
    }
}

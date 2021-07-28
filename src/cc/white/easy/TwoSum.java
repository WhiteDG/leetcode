package cc.white.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/15
 *     time   : 22:47
 *     desc   : 两数之和 https://cn.leetcode.com/problems/two-sum/description/
 * </pre>
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 17;
        int[] result = twoSum(nums, target);
        System.out.println("result:[" + result[0] + "," + result[1] + "]");
    }

    /**
     * 给定一个整数数列，找出其中和为特定值的那两个数。
     * 你可以假设每个输入都只会有一种答案，同样的元素不能被重用。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0, length = nums.length; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSumMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, length = nums.length; i < length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static int[] twoSumMap2(int[] nums, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))  {
                ret[0] = map.get(nums[i]);
                ret[1] = i;
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return ret;
    }
}

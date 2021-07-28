package cc.white.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.ToIntFunction;

/**
 * @author White
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        var ints = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ret = new HashSet<>();
        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) {
                    ret.add(j);
                }
            }
        }
        return ret.stream().mapToInt(value -> value).toArray();
    }
}

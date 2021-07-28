package cc.white.easy;

import java.util.Arrays;

/**
 * @author White
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] ints = {1, 1, 2, 2, 3, 4, 5, 5};
        var i = removeDuplicates(ints);
        System.out.println(i);
        System.out.println(Arrays.toString(ints));
    }

    private static int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return ++p;
    }

}

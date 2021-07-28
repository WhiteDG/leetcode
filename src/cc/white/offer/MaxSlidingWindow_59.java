package cc.white.offer;

import java.util.Arrays;

/**
 * @author White
 */
public class MaxSlidingWindow_59 {

    public static void main(String[] args) {
        int[] ints = maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length <= 1) {
            return nums;
        }
        int loopCount = nums.length - k + 1;
        int[] res = new int[loopCount];
        for (int i = 0; i < loopCount; i++) {
            int tempMax = Integer.MIN_VALUE;
            for (int j = i; j < k; j++) {
                tempMax = Math.max(tempMax, nums[j]);
            }
            res[i] = tempMax;
            k++;
        }
        return res;
    }

}

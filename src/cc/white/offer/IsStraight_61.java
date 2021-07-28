package cc.white.offer;

import java.util.Arrays;

/**
 * @author White
 */
public class IsStraight_61 {

    public static void main(String[] args) {
        boolean straight = isStraight(new int[]{0, 0, 2, 3, 5});
        System.out.println(straight);
    }

    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zeroNo = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                zeroNo++;
            } else {
                int spaces = nums[i + 1] - nums[i];
                if (spaces == 0) {
                    return false;
                }
                if (spaces == 1) {
                    continue;
                }
                if (zeroNo - (spaces - 1) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

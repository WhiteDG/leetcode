package cc.white.easy;

/**
 * @author White
 */
public class CanJump {

    public static void main(String[] args) {
//        boolean canJump = canJump(new int[]{2, 3, 1, 1, 4});
//        System.out.println(canJump);
//        canJump = canJump(new int[]{3, 2, 1, 0, 4});
//        System.out.println(canJump);
//        canJump = canJump(new int[]{2, 0, 0});
//        System.out.println(canJump);
//        boolean b = canJump(new int[]{3, 0, 8, 2, 0, 0, 1});
//        System.out.println(b);
//        boolean jump = canJump(new int[]{3, 2, 1, 0, 4});
//        System.out.println(jump);
//        boolean b = canJump(new int[]{0, 2, 3});
//        System.out.println(b);
        boolean b = canJump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0});
        System.out.println(b);
    }

    private static boolean canJump(int[] nums) {
        int len = nums.length;
        int rightMost = 0;
        for (int i = 0; i < len; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
                if (rightMost >= len - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

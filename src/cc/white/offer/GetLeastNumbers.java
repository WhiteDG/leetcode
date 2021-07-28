package cc.white.offer;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 *
 * @author White
 */
public class GetLeastNumbers {

    public static void main(String[] args) {
        int[] leastNumbers = getLeastNumbers(new int[]{1, 2, 6, 7, 8, 432, 3, 1}, 4);
        System.out.println(Arrays.toString(leastNumbers));
    }

    private static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        if (k >= 0) System.arraycopy(arr, 0, res, 0, k);
        return res;
    }
}

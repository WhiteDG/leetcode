package cc.white.offer;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 *
 * @author White
 */
public class PrintNumbers_17 {

    public static void main(String[] args) {
        int[] ints = printNumbers(2);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] printNumbers(int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = max * 10 + 9;
        }
        int[] ret = new int[max];
        for (int i = 1; i <= max; i++) {
            ret[i - 1] = i;
        }
        return ret;
    }
}

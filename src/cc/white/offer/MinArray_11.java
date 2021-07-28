package cc.white.offer;

/**
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 *
 * @author White
 */
public class MinArray_11 {

    public static void main(String[] args) {
        int i = minArray(new int[]{3, 4, 5, 1, 2});
        System.out.println(i);
    }

    private static int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i + 1] < numbers[i]) {
                return numbers[i + 1];
            }
        }
        return -1;
    }

    private static int minArr(int[] numbers) {
        int mid;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            mid = (left + right) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}

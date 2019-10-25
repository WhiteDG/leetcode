package cc.white.easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/24
 *     time   : 14:13
 *     desc   : https://leetcode-cn.com/problems/happy-number/description/
 * </pre>
 */
public class HappyNumber {

    public static void main(String[] args) {
        boolean happy = isHappy(18);
        System.out.println(happy);
    }

    /**
     * 写一个算法来判断一个数是不是“快乐数”。
     * <p>
     * 一个数是不是快乐是这么定义的：
     * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
     * 或是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
     * <p>
     * 案例: 19 是一个快乐数。
     * <p>
     * 12 + 92 = 82
     * 82 + 22 = 68
     * 62 + 82 = 100
     * 12 + 02 + 02 = 1
     *
     * @param num
     * @return
     */
    public static boolean isHappy(int num) {
        if (num == 1) {
            return true;
        }
        Map<Integer, Boolean> map = new LinkedHashMap<>();
        map.put(num, true);
        while (num != 1) {
            num = squares(num);
            // 已经出现过，继续下去就是无限循环了
            if (map.get(num) != null) {
                return false;
            }
            map.put(num, true);
        }
        return true;
    }

    /**
     * 将该数替换为它每个位置上的数字的平方和
     *
     * @param num
     * @return
     */
    private static int squares(int num) {
        int result = 0;
        int sq;
        for (; num > 0; num = num / 10) {
            sq = num % 10;
            result += (sq * sq);
        }
        return result;
    }
}


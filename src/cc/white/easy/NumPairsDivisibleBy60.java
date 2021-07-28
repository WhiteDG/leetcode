package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 * 输入：[30,20,150,100,40]
 * 输出：3
 * 解释：这三对的总持续时间可被 60 整数：
 * (time[0] = 30, time[2] = 150): 总持续时间 180
 * (time[1] = 20, time[3] = 100): 总持续时间 120
 * (time[1] = 20, time[4] = 40): 总持续时间 60
 *
 * tips:
 * 1 <= time.length <= 60000
 * 1 <= time[i] <= 500
 */
public class NumPairsDivisibleBy60 {

    public static void main(String[] args) {
        int[] time = new int[]{30, 20, 150, 100, 40};
        int i = numPairsDivisibleBy60(time);
        System.out.println(i);
        time = new int[]{60, 60, 60};
        i = numPairsDivisibleBy60(time);
        System.out.println(i);
    }

    /**
     * 暴力 超时
     * @param time
     * @return
     */
    public static int numPairsDivisibleBy60(int[] time) {
        int num = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    num++;
                }
            }
        }
        return num;
    }
}

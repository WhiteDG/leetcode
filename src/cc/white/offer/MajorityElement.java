package cc.white.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 *
 * @author White
 */
public class MajorityElement {

    public static void main(String[] args) {
        int i = majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2});
        System.out.println(i);
    }

    private static int majorityElement(int[] nums) {
        int half = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer val = map.get(num);
            val = val == null ? 1 : ++val;
            if (val > half) {
                return num;
            }
            map.put(num, val);
        }
        return -1;
    }
}

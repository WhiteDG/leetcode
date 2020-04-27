package cc.white.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 13:29
 *     desc   :
 * </pre>
 */
public class RomanToInteger {

    public static void main(String[] args) {
        int romanToInt = romanToInt("XIII");
        System.out.println(romanToInt);
    }

    /**
     * 相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
     * <p>
     * 小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
     * <p>
     * 小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9。
     *
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] chars = s.toCharArray();
        int len = s.length();
        int sum = map.get(chars[len - 1]);
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(chars[i]) < map.get(chars[i + 1])) {
                sum -= map.get(chars[i]);
            } else {
                sum += map.get(chars[i]);
            }
        }
        return sum;
    }
}

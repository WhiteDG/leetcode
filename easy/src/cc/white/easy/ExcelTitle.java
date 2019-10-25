package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/23
 *     time   : 21:57
 *     desc   : https://leetcode-cn.com/problems/excel-sheet-column-title/description/
 * </pre>
 */
public class ExcelTitle {

    public static void main(String[] args) {
        String convertToTitle = convertToTitle(52);
        System.out.println(convertToTitle);
    }

    /**
     * 给定一个正整数，返回它在Excel表中相对应的列名称。
     * <p>
     * 示例：
     * 1 -> A
     * 2 -> B
     * 3 -> C
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     *
     * @param n
     * @return
     */
    public static String convertToTitle(int n) {
        String CONST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            // 取余确定最后一位
            int mod = n % 26;
            n = n / 26;
            if (mod == 0) {
                sb.append('Z');
                // 往前走一位
                n--;
            } else {
                sb.append(CONST.charAt(mod - 1));
            }
        }
        return sb.reverse().toString();
    }
}

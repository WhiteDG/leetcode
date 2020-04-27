package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/24
 *     time   : 11:29
 *     desc   : https://leetcode-cn.com/problems/excel-sheet-column-number/description/
 * </pre>
 */
public class ExcelTitleToNumber {

    public static void main(String[] args) {
        int titleToNumber = titleToNumber("AAB");
        System.out.println(titleToNumber);
    }

    /**
     * 给定一个Excel表格中的列名称，返回其相应的列序号。
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     *
     * @param s
     * @return
     */
    public static int titleToNumber(String s) {
        String CONST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int total = 0;
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int pos = CONST.indexOf(c) + 1;
            int pow = (int) Math.pow(26, j++);
            total += (pow * pos);
        }
        return total;
    }
}

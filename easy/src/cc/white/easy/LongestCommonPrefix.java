package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/17
 *     time   : 14:03
 *     desc   : https://leetcode-cn.com/problems/longest-common-prefix/description/
 * </pre>
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"abc", "abcd", "abcde", "ac"};
        String longestCommonPrefix = longestCommonPrefix(strs);
        System.out.println(longestCommonPrefix);
    }

    /**
     * 查找字符串数组中最长的公共前缀字符串。
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        // 取第一个字符串作为模板，与后面的字符串作比较
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            // 如果返回的子串起始位置不为0，就去掉最后一位再做比较
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }
}

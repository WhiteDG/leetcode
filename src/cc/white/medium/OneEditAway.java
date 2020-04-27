package cc.white.medium;

/**
 * @author White
 * https://leetcode-cn.com/problems/one-away-lcci/
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
 * 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 */
public class OneEditAway {

    public static void main(String[] args) {
        boolean b = oneEditAway("b", "a");
        System.out.println(b);
    }

    public static boolean oneEditAway(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        int firstLength = first.length();
        int secondLength = second.length();
        int i = firstLength - secondLength;
        // 只有长度相差小于 1 才有可能通过一次操作编辑
        if (Math.abs(i) > 1) {
            return false;
        }
        String longest = i > 0 ? first : second;
        String shortest = i > 0 ? second : first;
        // 长度相差小于 1 并且有一个为空字符串时必定只操作一次即可
        if (shortest.length() == 0) {
            return true;
        }
        for (int j = 0; j < shortest.length(); j++) {
            if (longest.charAt(j) != shortest.charAt(j)) {
                // 出现不同字符串时，长串后面的必须与短串后面的相同
                return longest.substring(j + 1)
                        .equals(shortest.substring(longest.length() == shortest.length() ? j + 1 : j));
            }
        }
        return true;
    }
}

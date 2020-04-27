package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/compress-string-lcci/
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。
 * 若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 你可以假设字符串中只包含大小写英文字母（a至z）。
 */
public class CompressString {
    public static void main(String[] args) {
        String aabcccccaaa = compressString0("aabcccccaaa");
        System.out.println(aabcccccaaa);
    }

    public static String compressString(String S) {
        if (S == null || S.equals("")) {
            return S;
        }
        char[] chars = S.toCharArray();
        char prevChar = chars[0];
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char curChar : chars) {
            if (prevChar == curChar) {
                count++;
            } else {
                sb.append(prevChar).append(count);
                count = 1;
            }
            prevChar = curChar;
        }
        sb.append(prevChar).append(count);
        return sb.length() >= S.length() ? S : sb.toString();
    }

    public static String compressString0(String S) {
        if (S == null || S.equals("")) {
            return S;
        }
        char[] chars = S.toCharArray();
        int count = 1;
        StringBuilder sb = new StringBuilder().append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                sb.append(count).append(chars[i]);
                count = 1;
            }
        }
        sb.append(count);
        return sb.length() >= S.length() ? S : sb.toString();
    }
}

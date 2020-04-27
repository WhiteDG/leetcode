package cc.white.easy;

import java.util.Arrays;

/**
 * @author White
 * https://leetcode-cn.com/problems/string-to-url-lcci/
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。
 * 假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 */
public class ReplaceSpaces {

    public static void main(String[] args) {
//        String s = replaceSpaces("Mr John Smith    ", 13);
        String s = replaceSpaces("ds sdfs afs sdfa dfssf asdf             ",27);
        System.out.println(s);
    }

    public static String replaceSpaces(String S, int length) {
        char[] newChars = new char[S.length()];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char aChar = S.charAt(i);
            if (aChar == ' ') {
                newChars[index++] = '%';
                newChars[index++] = '2';
                newChars[index++] = '0';
            } else {
                newChars[index++] = aChar;
            }
        }
        return String.valueOf(newChars);
    }
}

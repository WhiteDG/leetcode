package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWords {

    public static void main(String[] args) {
        var s = reverseWords("Let's take LeetCode contest");
        System.out.println(s);

        s = reverseWords1("Let's take LeetCode contest");
        System.out.println(s);
    }

    private static String reverseWords(String s) {
        var s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s2 : s1) {
            var chars = s2.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
            sb.append(chars).append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private static String reverseWords1(String s) {
        var chars = s.toCharArray();
        int start = 0;
        int end;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                end = i - 1;
                reverse(chars, start, end);
                start = i + 1;
            }
        }
        reverse(chars, start, chars.length - 1);
        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        int left = start;
        int right = end;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }
}

package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/reverse-string/
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(chars);
        char[] chars1 = {'H','n','a','a','n','h'};
        reverseString(chars1);
        System.out.println(chars1);
    }

    private static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left <= right) {
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}

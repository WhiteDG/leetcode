package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/17
 *     time   : 22:19
 *     desc   : https://leetcode-cn.com/problems/valid-parentheses/description/
 * </pre>
 */
public class ValidParentheses {

    public static void main(String[] args) {
        boolean valid = isValid("[{}]");
        System.out.println(valid);
    }

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 括号必须以正确的顺序关闭，"()" 和 "()[]{}" 是有效的但是 "(]" 和 "([)]" 不是。
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        int top = 0;
        char[] stack = new char[s.length() + 1];
        char[] array = s.toCharArray();
        for (char c : array) {
            if (c == '(' || c == '{' || c == '[') {
                stack[top++] = c;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            } else if (c == '}' && stack[--top] != '{') {
                return false;
            }
        }
        return top == 0;
    }
}

package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        var foo = removeDuplicates("abbaca");
        System.out.println(foo);
    }

    private static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            var c = S.charAt(i);
            if (top >= 0 && sb.charAt(top) == c) {
                sb.deleteCharAt(top);
                --top;
            } else {
                sb.append(c);
                ++top;
            }
        }
        return sb.toString();
    }
}

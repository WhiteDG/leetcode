package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/add-strings/
 */
public class AddStrings {

    public static void main(String[] args) {
        var s = addStrings("123", "3334");
        System.out.println(s);
    }

    private static String addStrings(String num1, String num2) {
        var num1Chars = num1.toCharArray();
        var num2Chars = num2.toCharArray();
        var length1 = num1Chars.length;
        var length2 = num2Chars.length;
        int flag = 0;
        StringBuilder ans = new StringBuilder();

        int index1 = length1 - 1;
        int index2 = length2 - 1;

        while (index1 >= 0 || index2 >= 0 || flag != 0) {
            int x = index1 >= 0 ? num1Chars[index1--] - '0' : 0;
            int y = index2 >= 0 ? num2Chars[index2--] - '0' : 0;
            int temp = x + y + flag;
            ans.append(temp % 10);
            flag = temp / 10;
        }

        return ans.reverse().toString();
    }
}

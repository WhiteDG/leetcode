package cc.white.offer;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * <p>
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 *
 * @author White
 */
public class ReverseLeftWords_58 {

    public static void main(String[] args) {
        String abcdefg = reverseLeftWords("abcdefg", 2);
        System.out.println(abcdefg);
        String lrloseumgh = reverseLeftWords("lrloseumgh", 6);
        System.out.println(lrloseumgh);
    }

    public static String reverseLeftWords(String s, int n) {
//        return subString(s, n);
        return rlw(s, n);
    }

    private static String rlw(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    private static String subString(String s, int n) {
        String left = s.substring(0, n);
        String right = s.substring(n);
        return right + left;
    }
}

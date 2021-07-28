package cc.white.offer;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * @author White
 */
public class ReplaceSpace_05 {

    public static void main(String[] args) {
        String s = replaceSpace1("We are happy.");
        System.out.println(s);
    }

    private static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == ' ') {
                sb.append("%20");
            } else {
                sb.append(aChar);
            }
        }
        return sb.toString();
    }

    private static String replaceSpace1(String s) {
        char[] ret = new char[s.length() * 3];
        char[] chars = s.toCharArray();
        int index = 0;
        for (char aChar : chars) {
            if (aChar == ' ') {
                ret[index++] = '%';
                ret[index++] = '2';
                ret[index++] = '0';
            } else {
                ret[index++] = aChar;
            }
        }
        return new String(ret, 0, index);
    }
}

package cc.white.offer;

/**
 * https://leetcode-cn.com/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/
 *
 * @author White
 */
public class StrToInt_67 {

    public static void main(String[] args) {
        int i = str2int("42");
        System.out.println(i);
        int i1 = str2int("   -42");
        System.out.println(i1);
        int i2 = str2int("4139 white words");
        System.out.println(i2);
        int i3 = str2int("words and 987");
        System.out.println(i3);
        int i4 = str2int("-91283472332");
        System.out.println(i4);
        int i5 = str2int("3.14159");
        System.out.println(i5);
    }

    /**
     *
     * @param str
     * @return
     */
    private static int str2int(String str) {
        if (str == null || str.trim().equals("")) {
            return 0;
        }
        str = str.trim();
        char[] chars = str.toCharArray();
        boolean positive = true;
        int bndry = Integer.MAX_VALUE / 10;
        int ret = 0;
        if (chars[0] == '-') {
            positive = false;
        } else if (chars[0] >= '0' && chars[0] <= '9') {
            ret = chars[0] - '0';
        } else if (chars[0] != '+') {
            return ret;
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                if (ret > bndry || ret == bndry && chars[i] > '7') {
                    return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ret = ret * 10 + (chars[i] - '0');
            } else {
                break;
            }
        }
        return positive ? ret : -ret;
    }
}

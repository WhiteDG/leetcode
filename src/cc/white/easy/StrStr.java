package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 16:57
 *     desc   :
 * </pre>
 */
public class StrStr {

    public static void main(String[] args) {
        int i = strStr("", "");
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needLength = needle.length();
        if (needLength > hayLength) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}

package cc.white.easy;

/**
 * @author White
 * https://leetcode-cn.com/problems/detect-capital/
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * <p>
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * <p>
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 */
public class DetectCapitalUse {

    public static void main(String[] args) {
        boolean usa = detectCapitalUse1("USA");
        System.out.println(usa);
        boolean leetcode = detectCapitalUse1("leetcode");
        System.out.println(leetcode);
        boolean Google = detectCapitalUse1("Google");
        System.out.println(Google);
        boolean flaG = detectCapitalUse1("FlaG");
        System.out.println(flaG);
        boolean GG = detectCapitalUse1("GG");
        System.out.println(GG);
        boolean ff = detectCapitalUse1("ffffffffffffffffffffF");
        System.out.println(ff);
        boolean G = detectCapitalUse1("G");
        System.out.println(G);
    }

    /**
     * 暴力法
     *
     * @param word
     * @return
     */
    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int upperNum = 0;
        for (char aChar : chars) {
            if (aChar >= 'A' && aChar <= 'Z') {
                upperNum++;
            }
        }
        return upperNum == chars.length
                || upperNum == 0
                || (upperNum == 1 && chars[0] >= 'A' && chars[0] <= 'Z');
    }

    public static boolean detectCapitalUse1(String word) {
        char[] chars = word.toCharArray();
        char firstChar = chars[0];
        int length = chars.length;
        if (length == 1) {
            return true;
        }
        if (firstChar >= 'A' && firstChar <= 'Z') {
            if (length == 2) {
                return true;
            } else {
                char secondChar = chars[1];
                if (secondChar >= 'A' && secondChar <= 'Z') {
                    for (int i = 2; i < length; i++) {
                        if (!(chars[i] >= 'A' && chars[i] <= 'Z')) {
                            return false;
                        }
                    }
                } else {
                    for (int i = 2; i < length; i++) {
                        if ((chars[i] >= 'A' && chars[i] <= 'Z')) {
                            return false;
                        }
                    }
                }
            }
        } else {
            for (int i = 1; i < length; i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    return false;
                }
            }
        }
        return true;
    }

}

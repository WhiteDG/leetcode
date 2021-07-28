package cc.white.offer;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"。
 * https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 *
 * @author White
 */
public class ReverseWords_58 {

    public static void main(String[] args) {
        String theSkyIsBlue = reverseWords("the sky is blue");
        System.out.println(theSkyIsBlue);
        String helloWorld = reverseWords("  hello world!  ");
        System.out.println(helloWorld);
        String goodExample = reverseWords("a good   example");
        System.out.println(goodExample);
    }

    public static String reverseWords(String s) {
//        return splitStr(s);
        return doublePointer(s);
    }

    private static String doublePointer(String s) {
        /*
          1. 去前后空格
          2. 从后往前遍历，找第一个空格，确定最后一个单词的左右下标
          3. 根据左右下标截取单词，append 到新字符串再 append 空格
          4. 继续往前遍历，找到下一个非空字符，重置左右索引为此位置
         */
        s = s.trim(); // 去首尾空格
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int left = chars.length - 1, right = left;
        while (left >= 0) {
            while (left >= 0 && chars[left] != ' ') left--; // 找第一个空格
            sb.append(s, left + 1, right + 1).append(" "); // 获取第一个单词
            while (left >= 0 && chars[left] == ' ') left--; // 跳过空格
            right = left; // 重置右索引
        }
        return sb.toString().trim();
    }

    private static String splitStr(String s) {
        if (s == null) {
            return null;
        }
        if (s.trim().length() == 0) {
            return "";
        }
        String[] s1 = s.trim().split(" ");
        int length = s1.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            if ("".equals(s1[i])) {
                continue;
            }
            stringBuilder.append(s1[i]);
            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}

package cc.white.easy;

/**
 * @author White
 */
public class CountAndSay {
    public static void main(String[] args) {
        String s = countAndSay(4);
        System.out.println(s);
    }

    private static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        char[] chars = new char[1];
        chars[0] = 1;
        int i = 1;
        while (i <= n) {
            char cur = 0;
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                if (chars[j] != cur) {
                    if (count > 0) {
                        sb.append(count).append(cur);
                    }
                    count = 0;
                    cur = chars[j];
                }
                count++;
            }
            chars = sb.append(count).append(cur).toString().toCharArray();
            i++;
        }
        return new String(chars);
    }
}


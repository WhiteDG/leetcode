package cc.white.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author White
 * https://leetcode-cn.com/problems/check-permutation-lcci/
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 */

public class CheckPermutation {


    public static void main(String[] args) {
        boolean b0 = checkPermutation("abc", "bca");
        System.out.println(b0);
        boolean b1 = checkPermutation("abc", "bad");
        System.out.println(b1);

    }

    public static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        List<Character> characters = new ArrayList<>();
        for (char c : chars1) {
            characters.add(c);
        }
        for (char c : chars2) {
            if (characters.contains(c)) {
                characters.remove((Character) c);
            }
        }
        return characters.size() == 0;
    }
}

package cc.white.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author White
 * https://leetcode-cn.com/problems/palindrome-permutation-lcci/
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * 回文串不一定是字典当中的单词。
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 */
public class CanPermutePalindrome {

    public static void main(String[] args) {
        boolean tactcoa = canPermutePalindrome("codecode");
        System.out.println(tactcoa);
    }

    public static boolean canPermutePalindrome(String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        return set.size() <= 1;
    }
}

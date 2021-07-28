package cc.white.easy;

/**
 * @author White
 */
public class IsPalindrome {

    public static void main(String[] args) {
        isPalindrome(0);
        isPalindrome(-12);
        isPalindrome(121);
        isPalindrome(123);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int temp = x;
        long revertedNum = 0;
        for (; x != 0; x /= 10) {
            revertedNum = revertedNum * 10 + x % 10;
        }
        return revertedNum == temp;
    }
}

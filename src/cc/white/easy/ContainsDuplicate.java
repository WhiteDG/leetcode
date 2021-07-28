package cc.white.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author White
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        boolean b = containsDuplicate(new int[]{1, 2, 3, 1});
        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] num) {
        Set<Integer> set = new HashSet<>(num.length);
        for (int i : num) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}

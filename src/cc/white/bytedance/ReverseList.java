package cc.white.bytedance;

import java.util.HashSet;
import java.util.Set;

/**
 * @author White
 */
public class ReverseList {

    static class ListNode {
        int val;
        ListNode next;
    }

    public static void main(String[] args) {
        final int a = a(new int[]{7, 1, 5, 3, 6, 4});
        final int b = a(new int[]{7, 6, 4, 3, 1});
        final int c = a(new int[]{2, 4, 1});
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static ListNode reverse(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
//        ListNode reverse = reverse(listNode.next);
//        listNode.next.next = listNode;
//        listNode.next = null;
//        return reverse;
        ListNode prev = null;
        ListNode cur = listNode;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return listNode;
    }

    public static int foo(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            return 1;
        }
        Set<Character> list = new HashSet<>();
        int ans = 0;
        for (char ch : chars) {
            if (list.contains(ch)) {
                ans++;
                list.remove(ch);
            } else {
                list.add(ch);
            }
        }
        return list.isEmpty() ? ans * 2 : ans * 2 + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int a(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        int profit;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = price - min;
            max = Math.max(max, profit);
        }
        return max > min ? max - min : 0;
    }
}

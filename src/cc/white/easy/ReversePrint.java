package cc.white.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author White
 */
public class ReversePrint {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        int[] ints = reversePrint(head);
        System.out.println(Arrays.toString(ints));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] res = new int[list.size()];
        int j = list.size() - 1;
        IntStream.iterate(j, i -> i >= 0, i -> i - 1)
                .forEach(i -> res[i] = list.get(j - i));
        return res;
    }
}

package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/21
 *     time   : 21:44
 *     desc   : https://leetcode-cn.com/problems/linked-list-cycle/description/
 * </pre>
 */
public class HasCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;
        boolean hasCycle = hasCycle(head);
        System.out.println(hasCycle);
    }

    /**
     * 给定一个链表，判断链表中否有环。
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && slow != null && fast.next != null) {
            if (fast.next == slow || fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

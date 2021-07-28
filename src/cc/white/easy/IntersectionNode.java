package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/21
 *     time   : 23:03
 *     desc   : https://leetcode-cn.com/problems/intersection-of-two-linked-lists/description/
 * </pre>
 */
public class IntersectionNode {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);

        ListNode headB = new ListNode(2);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);

        ListNode c1 = new ListNode(10);
        ListNode c2 = new ListNode(11);

        headA.next = a1;
        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        headB.next = b1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        ListNode intersectionNode = getIntersectionNode(headA, headB);
        System.out.println(intersectionNode.val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode t1 = headA;
        ListNode t2 = headB;
        while (t1 != t2) {
            t1 = t1 == null ? headB : t1.next;
            t2 = t2 == null ? headA : t2.next;
        }
        return t1;
    }
}

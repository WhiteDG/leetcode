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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // FIXME
        if (headA == null || headB == null) {
            return null;
        }
        if (headA.val == headB.val) {
            return headA;
        }
        ListNode temp = headA;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = headB;
        // 判断链表是否有环
        ListNode slow = temp;
        ListNode fast = temp.next;
        while (slow != null && fast != null && fast.next != null) {
            if (fast.next == slow || fast == slow) {
                return slow;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

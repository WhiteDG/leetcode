package cc.white.offer;

import cc.white.util.ListNode;

/**
 * https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 *
 * @author White
 */
public class GetIntersectionNode_52 {

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode c1 = new ListNode(3);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);
        ListNode b1 = new ListNode(-1);
        ListNode b2 = new ListNode(-2);
        ListNode b3 = new ListNode(-3);

        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        ListNode intersectionNode = getIntersectionNode(a1, b1);
        System.out.println(intersectionNode.val);

        ListNode l2 = new ListNode(2);
        ListNode l6 = new ListNode(6);
        ListNode l4 = new ListNode(4);
        ListNode r1 = new ListNode(1);
        ListNode r5 = new ListNode(5);
        l2.next = l6;
        l6.next = l4;
        r1.next = r5;
        intersectionNode = getIntersectionNode(l2, r1);
        System.out.println(intersectionNode);
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != tempB) {
            tempA = tempA != null ? tempA.next : headB;
            tempB = tempB != null ? tempB.next : headA;
        }
        return tempA;
    }
}

package cc.white.easy;

import cc.white.util.ListNode;

/**
 * @author White
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleNodeOfTheLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
//        l5.next = l6;

        var listNode = middleNode(l1);
        listNode.print();
    }

    private static ListNode middleNode(ListNode root) {
        ListNode slow = root;
        ListNode right = root;

        while (right != null && right.next != null) {
            slow = slow.next;
            right = right.next.next;
        }
        return slow;
    }
}

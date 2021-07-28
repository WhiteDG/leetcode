package cc.white.offer;

import cc.white.util.ListNode;

/**
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 *
 * @author White
 */
public class GetKthFromEnd_22 {

    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);

        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode kthFromEnd = getKthFromEnd(listNode0, 2);
        assert kthFromEnd != null;
        System.out.println(kthFromEnd.val);
    }

    private static ListNode getKthFromEnd(ListNode head, int k) {
        if (head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (head != null) {
            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return null;
                }
                temp = temp.next;
            }
            if (temp == null) {
                return head;
            }
            head = head.next;
            temp = head;
        }
        return null;
    }
}

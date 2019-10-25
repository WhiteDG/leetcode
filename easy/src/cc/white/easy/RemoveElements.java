package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/24
 *     time   : 14:43
 *     desc   : https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 * </pre>
 */
public class RemoveElements {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode listNode = removeElements(head, 6);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode temp = result;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

package cc.white.medium;

/**
 * @author wh1te
 * e-mail: white.hcj@gmail.com
 * date: 2019-06-04 20:36
 * desc: https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        l1.next = n4;
        n4.next = n3;

        ListNode l2 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n4_ = new ListNode(4);
        l2.next = n6;
        n6.next = n4_;

        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p1 = l1, p2 = l2, curr = result;
        // 进位
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = p1 == null ? 0 : p1.val;
            int y = p2 == null ? 0 : p2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
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

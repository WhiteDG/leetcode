package cc.white.easy;

import cc.white.util.ListNode;

/**
 * @author White
 * https://leetcode-cn.com/problems/palindrome-linked-list/solution/
 */
public class PalindromeLinkedList {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        // 1. 快慢指针找到中点
        // 2. 反转后半部分链表
        // 3. 遍历比较
        // 4. 恢复链表

        ListNode mid = findMid(head);
        ListNode secondHalfStart = reverseList(mid.next);

        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) {
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        mid.next = reverseList(secondHalfStart);
        return result;
    }

    private static ListNode reverseList(ListNode node) {
        ListNode prev = null;
        ListNode cur = node;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    private static ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

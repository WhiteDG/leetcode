package cc.white.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author White
 * https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 */
public class RemoveDuplicateNodes {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = null;
        System.out.print("origin: ");
        printNode(listNode1);
        ListNode listNode = removeDuplicateNodes(listNode1);
        System.out.print("result: ");
        printNode(listNode);
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        ListNode pre = head;
        ListNode later = null;
        Set<Integer> set = new HashSet<>();
        while (pre != null) {
            boolean contains = set.contains(pre.val);
            if (!contains) {
                set.add(pre.val);
                later = pre;
            } else {
                later.next = pre;
            }
            pre = pre.next;
        }
        return head;
    }

    private static void printNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

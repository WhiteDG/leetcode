package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/18
 *     time   : 22:05
 *     desc   : https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/description/
 * </pre>
 */
public class DeleteDuplicates {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(3);
        listNode.next = first;
        first.next = second;
        second.next = third;
        third.next = forth;

        ListNode deleteNode = deleteDuplicates(listNode);
        while (deleteNode != null) {
            System.out.println(deleteNode.val);
            deleteNode = deleteNode.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 给定一个排序链表，删除所有重复的元素使得每个元素只留下一个。
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            int val = temp.val;
            int nextVal = temp.next.val;
            if (nextVal == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}

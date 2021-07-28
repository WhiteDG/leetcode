package cc.white.util;

/**
 * @author White
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        this.val = x;
    }

    public void print() {
        ListNode temp = this;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.val).append("->");
            temp = temp.next;
        }
        String result = sb.toString();
        if (result.endsWith("->")) {
            result = sb.substring(0, sb.length() - 2);
        }
        System.out.println(result);
    }
}

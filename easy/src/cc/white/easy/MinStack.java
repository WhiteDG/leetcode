package cc.white.easy;

import java.util.Stack;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/21
 *     time   : 22:47
 *     desc   : https://leetcode-cn.com/problems/min-stack/description/
 * </pre>
 */
public class MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    private class Node {
        private int val;
        private int min;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    private Stack<Node> nodeStack = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
        Node node;
        if (nodeStack.isEmpty()) {
            node = new Node(x, x);
        } else {
            Node peek = nodeStack.peek();
            node = new Node(x, Math.min(peek.min, x));
        }
        nodeStack.push(node);
    }

    public void pop() {
        if (!nodeStack.isEmpty()) {
            nodeStack.pop();
        }
    }

    public int top() {
        return nodeStack.peek().val;
    }

    public int getMin() {
        return nodeStack.peek().min;
    }
}

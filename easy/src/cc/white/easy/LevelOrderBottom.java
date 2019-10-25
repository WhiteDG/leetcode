package cc.white.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/19
 *     time   : 21:31
 *     desc   : https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/description/
 * </pre>
 */
public class LevelOrderBottom {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(5);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        List<List<Integer>> lists = levelOrderBottom(root);
        for (List<Integer> list : lists) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<TreeNode> p = new LinkedList<>();
        p.add(root);
        while (!p.isEmpty()) {
            int size = p.size();
            List<Integer> sub = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = p.remove();
                sub.add(node.val);
                if (node.left != null) {
                    p.add(node.left);
                }
                if (node.right != null) {
                    p.add(node.right);
                }
            }
            result.add(0, sub);
        }
        return result;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

package cc.white.offer;

import cc.white.util.TreeNode;

/**
 * @author White
 * https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 */
public class IsSymmetric_28 {

    public static void main(String[] args) {

    }

    private static boolean isSymmetric(TreeNode root) {
        return root == null || ok(root.left, root.right);
    }

    private static boolean ok(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return ok(left.left, left.right) && ok(right.left, right.right);
    }
}

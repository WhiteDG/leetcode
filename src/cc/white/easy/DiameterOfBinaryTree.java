package cc.white.easy;

import cc.white.util.TreeNode;

/**
 * @author White
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) {

    }

    private static int ans = 0;

    private static int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans;
    }

    private static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        ans = Math.max(left + right, ans);
        return Math.max(left, right) + 1;
    }
}

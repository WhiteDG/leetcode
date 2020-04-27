package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/19
 *     time   : 11:38
 *     desc   : https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/description/
 * </pre>
 */
public class MinDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(1);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n3.left = n4;
        int maxDepth = minDepth(root);
        System.out.println(maxDepth);
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return left == 0 || right == 0 ? 1 + left + right : 1 + Math.min(left, right);
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

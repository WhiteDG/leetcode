package cc.white.easy;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/19
 *     time   : 11:22
 *     desc   : https://leetcode-cn.com/problems/symmetric-tree/description/
 * </pre>
 */
public class SymmetricTree {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return check(left.left, right.right) && check(left.right, right.left);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

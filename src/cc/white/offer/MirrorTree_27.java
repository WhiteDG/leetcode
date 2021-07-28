package cc.white.offer;

import cc.white.util.TreeNode;

/**
 * @author White
 */
public class MirrorTree_27 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode9 = new TreeNode(9);
        root.left = treeNode2;
        root.right = treeNode7;
        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;
        treeNode7.left = treeNode6;
        treeNode7.right = treeNode9;
        mirrorTree(root);
        root.print();
    }

    private static TreeNode mirrorTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}

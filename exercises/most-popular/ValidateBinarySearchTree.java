// Given the root of a binary tree, determine if it is a valid binary search tree (BST).
public class ValidateBinarySearchTree {
 
    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        return validate(root.left, Long.MIN_VALUE, root.val) && validate(root.right, root.val, Long.MAX_VALUE);
    }
    
    public boolean validate(TreeNode root, long min, long max) {
        if(root == null) return true;
        if(root.val > min && root.val < max) {
            return validate(root.left, min, Math.min(root.val, max)) && validate(root.right, Math.max(min, root.val), max);
        } else {
            return false;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
}
// A binary tree is uni-valued if every node in the tree has the same value.
// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSame(root.left, root.val) && isSame(root.right, root.val);
    }
    
    public boolean isSame(TreeNode root, int val) {
        if(root == null) {
            return true;
        }
        if(root.val != val) {
            return false;
        }
        return isSame(root.left, val) && isSame(root.right, val);
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
public class ValidateBinarySearchTree {
    
    public boolean isValidBST(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean checkBST(TreeNode root, long min, long max) {
        if(root == null) {
            return true;
        }
        
        if(min < root.val && root.val < max) {
            return checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max);
        }
        
        return false;
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
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        if(root.left == null && root.right == null) {
            return root.val;
        } else if(root.left == null) {
            return findBottomLeftValue(root.right);
        } else if(root.right == null) {
            return findBottomLeftValue(root.left);
        } else if(height(root.left) >= height(root.right)) {
            return findBottomLeftValue(root.left);
        } else {
            return findBottomLeftValue(root.right);
        }
    }
    
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
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
// Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.
// A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
public class MaximumDifferenceBetweenNodeAndAncestor {

    public int maxAncestorDiff(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return dfs(root, root.val, root.val);
    }
    
    public int dfs(TreeNode root, int min, int max) {
        if(root == null) {
            return max - min;
        }
        min = Math.min(root.val, min);
        max = Math.max(root.val, max);
        return Math.max(dfs(root.left, min, max), dfs(root.right, min, max));
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
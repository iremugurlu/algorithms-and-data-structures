// Given the roots of two binary trees p and q, write a function to check if they are the same or not.
// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null) {
            if(q == null) return true;
            else return false;
        } else {
            if(q == null) return false;
            else {
                if(p.val != q.val) return false;
                else {
                    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                }
            }
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
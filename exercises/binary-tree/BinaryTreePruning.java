// Given the root of a binary tree, return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
// A subtree of a node node is node plus every node that is a descendant of node.
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        if(root.val == 1) {
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
        } else {
            boolean left = containsOne(root.left);
            boolean right = containsOne(root.right);
            if(!left && !right) {
                root = null;
            } else {
                if(left) {
                    root.left = pruneTree(root.left);
                } else {
                    root.left = null;
                }
                if(right) {
                    root.right = pruneTree(root.right);
                } else {
                    root.right = null;
                }                
            }
        }
        return root;
    }
    
    public boolean containsOne(TreeNode root) {
        if(root == null) {
            return false;
        }
        if(root.val == 1) {
            return true;
        } else {
            return containsOne(root.left) || containsOne(root.right);
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
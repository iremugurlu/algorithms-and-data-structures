// Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
class DeleteNodeInABST {

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

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        } else if(root.val == key) {
            if(root.left == null && root.right == null) {
                root = null;
            } else if(root.right == null) {
                root = root.left;
            } else if(root.left == null) {
                root = root.right;
            } else {
                // find min value
                TreeNode min = root.right;
                while(min.left != null) {
                    min = min.left;
                }
                // set this val to the root
                root.val = min.val;
                // delete that min node
                root.right = deleteNode(root.right, min.val);
            }
        } else if(root.left != null && key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if(root.right != null && key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
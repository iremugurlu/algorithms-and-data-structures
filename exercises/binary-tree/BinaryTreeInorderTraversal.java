// Given the root of a binary tree, return the inorder traversal of its nodes' values.
public class BinaryTreeInorderTraversal {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        if(root.left!=null) list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        if(root.right!=null) list.addAll(inorderTraversal(root.right));
        return list;        
    }
}
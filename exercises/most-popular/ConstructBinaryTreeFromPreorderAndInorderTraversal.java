// Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, 
// construct and return the binary tree.
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        return buildTree(preorder, inorder, 0, 0, inorder.length-1);
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
        if(preStart>preorder.length-1 || inStart > inEnd) return null;
        TreeNode head = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        for(int i=inStart; i<=inEnd; i++) {
            if(inorder[i] == head.val) {
                inIndex = i;
            }
        }
        head.left = buildTree(preorder, inorder, preStart+1, inStart, inIndex-1);
        head.right = buildTree(preorder, inorder, preStart+1+inIndex-inStart, inIndex+1, inEnd);
        return head;
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
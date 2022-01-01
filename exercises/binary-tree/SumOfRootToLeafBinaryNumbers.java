// You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path represents a binary number starting with the most significant bit.
// For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
// For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return the sum of these numbers.
// The test cases are generated so that the answer fits in a 32-bits integer.
public class SumOfRootToLeafBinaryNumbers {
    
    List<Integer> list;
    
    public int sumRootToLeaf(TreeNode root) {
        list = new ArrayList<>();
        getLeaves(root, 0);
        int sum = 0;
        for(int elem : list) {
            sum += elem;
        }
        return sum;
    }
    
    public void getLeaves(TreeNode root, int binary) {
        if(root == null) {
            return;
        }
        binary = binary*2 + root.val;
        if(root.left == null && root.right == null) {
            list.add(binary);
        } else if(root.left == null) {
            getLeaves(root.right, binary);
        } else if(root.right == null) {
            getLeaves(root.left, binary);
        } else {
            getLeaves(root.left, binary);
            getLeaves(root.right, binary);            
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
// Given the root of a binary tree, each node in the tree has a distinct value.
// After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
// Return the roots of the trees in the remaining forest. You may return the result in any order.
public class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result = new ArrayList<>();
        HashSet<Integer> toDelete = new HashSet<>();
        for(int i : to_delete) {
            toDelete.add(i);
        }
        deleteNodes(root, toDelete, result);
        if(!toDelete.contains(root.val)) {
            result.add(root);
        }
        return result;
    }
    
    public TreeNode deleteNodes(TreeNode root, HashSet<Integer> toDelete, List<TreeNode> result) {
        if(root == null) {
            return null;
        }
        root.left = deleteNodes(root.left, toDelete, result);
        root.right = deleteNodes(root.right, toDelete, result);
        if(toDelete.contains(root.val)) {
            if(root.left != null) {
                result.add(root.left);
            }
            if(root.right != null) {
                result.add(root.right);
            }
            return null;
        }
        return root;
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
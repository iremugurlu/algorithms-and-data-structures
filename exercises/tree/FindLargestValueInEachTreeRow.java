// Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        // This list will continue largest value for level i at index i
        List<Integer> values = new ArrayList<>();
        findLargest(root, values, 0);
        return values;
    }
    
    public void findLargest(TreeNode root, List<Integer> values, int level) {
        if(root == null) {
            return;
        }
        if(values.size() == level) {
            values.add(root.val);
        } else {
            values.set(level, Math.max(values.get(level), root.val));
        }
        findLargest(root.left, values, level+1);
        findLargest(root.right, values, level+1);
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
class DeepestLeavesSum {
    
    HashMap<Integer, Integer> levelSum;
    int maxLevel;
    
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        levelSum = new HashMap<>();
        maxLevel = 0;
        sumLevel(root, 0);
        return levelSum.get(maxLevel);
    }
    
    public void sumLevel(TreeNode root, int level) {
        if(root == null) return;
        maxLevel = Math.max(maxLevel, level);
        levelSum.put(level, levelSum.getOrDefault(level, 0) + root.val);
        sumLevel(root.left, level+1);
        sumLevel(root.right, level+1);
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
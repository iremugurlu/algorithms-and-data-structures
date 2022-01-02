// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
public class BinaryTreeLevelOrderTraversal {
    
    List<List<Integer>> levels;
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        levels = new ArrayList<>();
        if(root == null) {
            return levels;
        }
        traverseLevel(root, 0);
        return levels;
    }
    
    public void traverseLevel(TreeNode root, int level) {
        if(root == null) {
            return;
        }
        if(levels.size()<level+1) {
            levels.add(new ArrayList<>());
        }
        List<Integer> levelList = levels.get(level);
        levelList.add(root.val);
        traverseLevel(root.left, level+1);
        traverseLevel(root.right, level+1);
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
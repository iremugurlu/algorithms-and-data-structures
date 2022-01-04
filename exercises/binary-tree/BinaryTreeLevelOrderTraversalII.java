public class BinaryTreeLevelOrderTraversalII {
    
    List<List<Integer>> result;
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        result = new ArrayList<>();
        if(root == null) return result;
        traverseLevel(root, 0);
        int i=0;
        int j=result.size()-1;
        while(i<j) {
            List<Integer> tmp = result.get(i);
            result.set(i, result.get(j));
            result.set(j, tmp);
            i++;
            j--;
        }
        return result;
    }
    
    public void traverseLevel(TreeNode root, int level) {
        if(root == null) return;
        if(result.size()>level) {
            List<Integer> levelList = result.get(level);
            levelList.add(root.val);
            result.set(level, levelList);
        } else {
            result.add(new ArrayList<Integer>(Arrays.asList(root.val)));
        }
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
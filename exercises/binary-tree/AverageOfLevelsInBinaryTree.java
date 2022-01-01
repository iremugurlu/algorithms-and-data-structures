public class AverageOfLevelsInBinaryTree {
    
    List<List<Integer>> res;
    
    public List<Double> averageOfLevels(TreeNode root) {
        res = new ArrayList<>();
        List<Double> avg = new ArrayList<>();
        fillLevel(root, 0);
        for(List<Integer> r : res) {
            double sum = 0;
            for(double d : r) {
                sum += d;
            }
            double average = sum / r.size();
            avg.add(average);
        }
        return avg;
    }
    
    public void fillLevel(TreeNode root, int level) {
        if(root == null) {
            return;
        }
        if(res.size() < level+1) {
            res.add(new ArrayList<>());
        }
        List<Integer> list = res.get(level);
        list.add(root.val);
        res.set(level, list);
        fillLevel(root.left, level+1);
        fillLevel(root.right, level+1);
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
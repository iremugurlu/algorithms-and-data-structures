public class BinaryTreeZigzagLevelOrderTraversal {
    
    List<List<Integer>> result;
        
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        result = new ArrayList<>();
        if(root == null) return result;
        getZigzagLevel(root, 0);
        for(int i=1; i<result.size(); i+=2) {
            List<Integer> list = result.get(i);
            result.set(i, reverse(list));
        }
        return result;
    }
    
    public void getZigzagLevel(TreeNode root, int level) {
        if(root == null) return;
        if(result.size()>level) {
            List<Integer> levelList = result.get(level);
            levelList.add(root.val);
            result.set(level, levelList);
        } else {
            result.add(new ArrayList<Integer>(Arrays.asList(root.val)));
        }
        getZigzagLevel(root.left, level+1);
        getZigzagLevel(root.right, level+1);
    }
    
    public List<Integer> reverse(List<Integer> list) {
        int i=0;
        int j=list.size()-1;
        while(i<j) {
            int temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
            i++;
            j--;
        }
        return list;
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
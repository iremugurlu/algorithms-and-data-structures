public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        if(mid > 0) root.left = buildLeft(nums, mid-1);
        if(mid < nums.length-1) root.right = buildRight(nums, mid+1);
        return root;
    }
    
    public TreeNode buildLeft(int[] nums, int index) {
        TreeNode node = new TreeNode(nums[index]);
        if(index < 1) return node;
        node.left = buildLeft(nums, index-1);
        return node;
    }
    
    public TreeNode buildRight(int[] nums, int index) {
        TreeNode node = new TreeNode(nums[index]);
        if(index >= nums.length-1) return node;
        node.right = buildRight(nums, index+1);
        return node;
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
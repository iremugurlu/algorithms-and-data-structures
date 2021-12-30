// Given the root of a binary tree, flatten the tree into a "linked list":
// The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
// The "linked list" should be in the same order as a pre-order traversal of the binary tree.
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        traverse(root, queue);
        root = queue.poll();
        if(root == null) {
            return;
        }
        root.left = null;
        root.right = null;
        TreeNode curr = root;
        while(queue.size() > 0) {
            TreeNode node = queue.poll();
            node.left = null;
            node.right = null;
            curr.right = node;
            curr = curr.right;
        }
        curr.right = null;
    }
    
    public void traverse(TreeNode root, Queue<TreeNode> queue) {
        if(root != null) {
            queue.add(root);
            traverse(root.left, queue);
            traverse(root.right, queue);
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
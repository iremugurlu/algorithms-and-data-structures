public class CheckBinarySearchTree {
    
    boolean checkBST(Node root) {
        if(root.left == null) {
            return checkRight(root);
        } else {
            if(root.left.data < root.data) {
                return checkBST(root.left) && checkRight(root);
            } else return false;
        }
    }

    boolean checkRight(Node root) {
        if(root.right == null) return true;
        else {
            if(root.right.data > root.data) return checkBST(root.right);
            else return false;
        }
    }

    class Node {
        int data;
        Node left;
        Node right;
     }
}

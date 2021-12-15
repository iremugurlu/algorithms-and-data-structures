class Node {

    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(value <= data) {
            if(left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            } 
        } else {
            if(right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            } 
        }
    }

    public boolean contains(int value) {
        if(data == value) return true;
        else if(value < data) {
            if(left == null) return false;
            else return left.contains(value);
        } else {
            if(right == null) return false;
            else return right.contains(value);
        }
    }

    public void printInOrder() {
        if(left != null) left.printInOrder();
        System.out.println(data);
        if(right != null) right.printInOrder();
    }

    public boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean checkBST(Node root, int min, int max) {
        if(root == null) {
            return true;
        }
        if(root.data < min || root.data > max) {
            return false;
        }
        return checkBST(root.left, min, root.data-1) && checkBST(root.right, root.data+1, max);
    }
}


// Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
public class NAryTreePreorderTraversal {

    class Node {
        public int val;
        public List<Node> children;
    
        public Node() {}
    
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        res.add(root.val);
        List<Node> children = root.children;
        while(children.size() > 0) {
            Node child = children.remove(0);
            res.addAll(preorder(child));
        }
        return res;  
    }
}
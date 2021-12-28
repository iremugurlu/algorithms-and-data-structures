// Given the root of an n-ary tree, return the postorder traversal of its nodes' values.
public class NAryTreePostorderTraversal {

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

    public List<Integer> postorder(Node root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<Node> children = root.children;
        List<Integer> result = new ArrayList<>();
        while(children.size() > 0) {
            Node child = children.remove(0);
            result.addAll(postorder(child));
        }
        result.add(root.val);
        return result;
    }
}
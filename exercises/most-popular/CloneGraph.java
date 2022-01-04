// Given a reference of a node in a connected undirected graph.
// Return a deep copy (clone) of the graph.
public class CloneGraph {

    HashMap<Integer, Node> map;
        
    public Node cloneGraph(Node node) {
        map = new HashMap<>();
        return clone(node);
    }
    
    public Node clone(Node node) {
        if(node == null) return null;
        if(map.containsKey(node.val)) return map.get(node.val);
        Node copy = new Node(node.val);
        map.put(node.val, copy);
        for(Node neighbor : node.neighbors) {
            copy.neighbors.add(clone(neighbor));
        }
        return copy;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
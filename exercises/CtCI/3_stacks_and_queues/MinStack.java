public class MinStack {
    
    Node top;
    
    public MinStack() {
        top = null;
    }
    
    public void push(int val) {
        if(top == null) {
            Node node = new Node(val, val);
            top = node;
        } else {
            Node node = new Node(val, Math.min(top.min, val));
            node.next = top;
            top = node;
        }
    }
    
    public void pop() {
        Node node = top.next;
        top = node;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
    }
    
    class Node {
        
        int data;
        int min;
        Node next;
        
        public Node(int data, int min) {
            this.data = data;
            this.min = min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
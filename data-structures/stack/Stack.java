public class Stack {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if(isEmpty()) throw new IllegalStateException("Stack is empty!");
        else return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty!");
        else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }
}

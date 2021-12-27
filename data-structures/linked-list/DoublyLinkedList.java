// Design your implementation of the doubly linked list.
public class DoublyLinkedList {
    
    public class Node {
        
        int data;
        Node next;
        Node prev;
        
        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    
    public DoublyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        Node curr = head;
        while(index > 0 && curr != null) {
            curr = curr.next;
            index--;
        }
        if(curr == null) return -1;
        else return curr.data;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        if(head != null) head.prev = node;
        head = node;
    }
    
    public void addAtTail(int val) {
        if(head == null) {
            head = new Node(val);
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        Node node = new Node(val);
        current.next = node;
        node.prev = current;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0) {
            addAtHead(val);
        } else {
            Node prev = head;
            while(index-1 > 0) {
                if(prev == null) return;
                prev = prev.next;
                index--;
            }
            if(prev == null) return;
            Node node = new Node(val);
            node.next = prev.next;
            node.prev = prev;
            prev.next = node;
            Node next = node.next;
            if(next != null) next.prev = node;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(head == null) return;
        if(index == 0) {
            head = head.next;
            if(head != null) head.prev = null;
        } else {
            Node prev = head;
            while(index-1 > 0) {
                if(prev.next == null) return;
                prev = prev.next;
                index--;
            }
            if(prev.next == null) {
                prev = null;
            } else {
                prev.next = prev.next.next;
                Node next = prev.next;
                if(next != null) next.prev = prev;
            }            
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
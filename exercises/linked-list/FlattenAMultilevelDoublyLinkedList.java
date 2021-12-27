// Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list. 
// Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.
// Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
public class FlattenAMultilevelDoublyLinkedList {
    
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        if(head == null) return null;
        if(head.child != null) {
            Node node = head.child;
            Node curr = head;
            Node next = head.next;
            while(node != null) {
                curr.next = node;
                node.prev = curr;
                curr = curr.next;
                node = node.next;
            }
            curr.next = next;
            if(next != null) next.prev = curr;
            head.child = null;
        }
        head.next = flatten(head.next);
        return head;
    }
}
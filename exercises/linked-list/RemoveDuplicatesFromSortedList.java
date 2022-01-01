// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
public class RemoveDuplicatesFromSortedList {
    
    Set<Integer> existing;
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        existing = new HashSet<>();
        existing.add(head.val);
        ListNode prev = head;
        ListNode node = head.next;
        while(node != null) {
            if(existing.contains(node.val)) {
                prev.next = node.next;
                node = node.next;
            } else {
                existing.add(node.val);
                prev = node;
                node = node.next;  
            }            
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
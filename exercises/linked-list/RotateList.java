// Given the head of a linked list, rotate the list to the right by k places.
public class RotateList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode curr = head;
        ListNode prev = head;
        while(k > 0) {
            if(curr.next != null) {
                curr = curr.next;
            } else {
                curr = head;
            }
            k--;
        }
        while(curr.next != null) {
            curr = curr.next;
            if(prev.next == null) prev = head;
            else prev = prev.next;
        }
        ListNode newHead = prev.next;
        if(newHead == null) return head;
        prev.next = null;
        curr = newHead;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        return newHead;  
    }
}
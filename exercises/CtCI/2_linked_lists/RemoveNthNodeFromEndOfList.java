public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = head;
        while(n > 0) {
            curr = curr.next;
            n--;
        }
        if(curr == null) {
            return head.next;
        }
        while(curr != null && curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }
        if(prev.next == null) return null;
        prev.next = prev.next.next;
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
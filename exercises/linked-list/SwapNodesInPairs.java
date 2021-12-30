public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        if(head.next.next == null) {
            ListNode curr = head.next;
            head.next = null;
            curr.next = head;
            head = curr;
            return head;
        } else {
            ListNode curr = head.next;
            head.next = null;
            ListNode next = curr.next;
            head.next = swapPairs(next);
            curr.next = head;
            head = curr;
            return head;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
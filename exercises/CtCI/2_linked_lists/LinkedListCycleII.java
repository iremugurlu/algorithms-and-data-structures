public class LinkedListCycleII {
    
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;        
        while (fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode node = head; 
                while (node != slow){
                    slow = slow.next;
                    node = node.next;
                }
                return slow;
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

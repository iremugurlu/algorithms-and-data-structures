public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        } else if(l2 == null) {
            return l1;
        } else {
            l1.val += l2.val;
            if(l1.val >= 10) {
                int extra = l1.val/10;
                l1.val = l1.val%10;
                l1.next = addTwoNumbers(l1.next, addTwoNumbers(l2.next, new ListNode(extra)));
            } else {
                l1.next = addTwoNumbers(l1.next, l2.next);
            }
            return l1;
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

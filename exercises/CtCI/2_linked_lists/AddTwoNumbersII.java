public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);
        ListNode reversed = addNumbers(r1, r2);
        return reverse(reversed);
    }
    
    public ListNode reverse(ListNode node) {
        ListNode res = null;
        while(node != null) {
            ListNode curr = new ListNode(node.val);
            curr.next = res;
            res = curr;
            node = node.next;
        }
        return res;
    }
    
    public ListNode addNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        } else if(l2 == null) {
            return l1;
        } else {
            l1.val += l2.val;
            if(l1.val >= 10) {
                int extra = l1.val/10;
                l1.val = l1.val%10;
                l1.next = addNumbers(l1.next, addNumbers(l2.next, new ListNode(extra)));
            } else {
                l1.next = addNumbers(l1.next, l2.next);
            }
            return l1;
        }
    }
}
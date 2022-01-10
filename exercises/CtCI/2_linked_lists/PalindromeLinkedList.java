public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        if(head == null || head.next == null) return true;
        ListNode fast = head.next;
        while(slow != null && fast != null && fast.next != null) {
            if(fast.next.next == null) break;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next == null) {
            // even case
            ListNode rest = slow.next;
            slow.next = null;
            rest = reverseList(rest);
            return isEqual(head, rest);
        } else {
            // odd case
            ListNode rest = slow.next.next;
            slow.next = null;
            rest = reverseList(rest);
            return isEqual(head, rest);
        } 
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next != null) {
            ListNode node = curr.next;
            curr.next = node.next;
            node.next = head;
            head = node;
        }
        return head;
    }
    
    public boolean isEqual(ListNode node1, ListNode node2) {
        if(node1 == null && node2 == null) return true;
        else if(node1 == null || node2 == null) return false;
        else {
            if(node1.val == node2.val) {
                return isEqual(node1.next, node2.next);
            } else {
                return false;
            }
        }
    }

    public boolean isPalindromeSecondSolution(ListNode head) {
        ListNode reverse = reverseList(head);
        while(head != null && reverse != null) {
            if(head.val == reverse.val) {
                head = head.next;
                reverse = reverse.next;
            } else {
                return false;
            }
        }
        if(head != null || reverse != null) {
            return false;
        }
        return true;
    }
    
}
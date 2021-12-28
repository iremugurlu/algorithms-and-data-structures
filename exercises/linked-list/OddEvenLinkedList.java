// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
// The first node is considered odd, and the second node is even, and so on.
// Note that the relative order inside both the even and odd groups should remain as it was in the input.
public class OddEvenLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    public ListNode oddEvenList(ListNode head) {
        ListNode tail = head;
        int length = 1;
        while(tail != null && tail.next != null) {
            tail = tail.next;
            length++;
        }
        int index = 1;
        ListNode curr = head;
        ListNode prev = null;
        while(index <= length && curr != null && curr.next != null) {
            if(index%2 == 0) {
                prev.next = curr.next;
                curr.next = null;
                tail.next = curr;
                tail = curr;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
            index++;
        }
        return head;
    }

    // another method to solve the problem
    public ListNode oddEvenListSecondSolution(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

}
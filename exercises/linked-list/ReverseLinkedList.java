// Given the head of a singly linked list, reverse the list, and return the reversed list.
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // Solution strategy: iterate the nodes in original order and move them to the head of the list one by one.
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
}
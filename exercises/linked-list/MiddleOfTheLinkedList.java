// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.
public class MiddleOfTheLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        int length = 1;
        ListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
            length++;
        }
        int mid = length/2 + 1;
        int index = 1;
        while(index < mid) {
            head = head.next;
            index++;
        }
        return head;
    }
}
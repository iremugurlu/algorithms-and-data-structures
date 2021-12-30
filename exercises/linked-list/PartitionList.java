// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
// You should preserve the original relative order of the nodes in each of the two partitions.
public class PartitionList {

    // Create two nodes for small and large parts, update them through the way and merge them at the end
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return null;
        }
        ListNode smallHead = new ListNode(0);
        ListNode small = smallHead;
        ListNode largeHead = new ListNode(0);
        ListNode large = largeHead;
        
        while(head != null) {
            if(head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }

    public ListNode partitionMyLongSolution(ListNode head, int x) {
        if(head == null) {
            return null;
        }
        if(head.val >= x) {
            ListNode curr = head;
            while(curr.next != null && curr.next.val >= x) {
                curr = curr.next;
            }
            if(curr.next != null) {
                ListNode next = curr.next.next;
                ListNode node = curr.next;
                curr.next = next;
                node.next = head;
                head = node;
            }
        }
        ListNode curr = head;
        ListNode slow = head;
        while(curr.next != null) {
            if(curr.next.val >= x) {
                curr = curr.next;
            } else if(curr == slow) {
                curr = curr.next;
                slow = slow.next;
            } else {
                ListNode next = curr.next;
                curr.next = curr.next.next;
                ListNode backNext = slow.next;
                next.next = backNext;
                slow.next = next;
                slow = slow.next;
            }
        }
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
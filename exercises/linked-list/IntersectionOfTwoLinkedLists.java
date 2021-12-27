import java.util.*;

// Given the heads of two singly linked-lists headA and headB, 
// return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
public class IntersectionOfTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // solution with no additional memory
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode currA = headA;
        ListNode currB = headB;
        while(currA != currB) {
            if(currA == null) {
                currA = headB;
            } else {
                currA = currA.next;
            }
            if(currB == null) {
                currB = headA;
            } else {
                currB = currB.next;
            }
        }
        return currA;
    }

    // solution with additional memory
    public ListNode getIntersectionNodeWithAdditionalMemory(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();
        while(headA != null && headB != null) {
            if(headA == headB) return headA;
            if(nodes.contains(headA)) return headA;
            if(nodes.contains(headB)) return headB;
            nodes.add(headA);
            nodes.add(headB);
            headA = headA.next;
            headB = headB.next;
        }
        while(headA != null) {
            if(nodes.contains(headA)) return headA;
            nodes.add(headA);
            headA = headA.next;
        }
        while(headB != null) {
            if(nodes.contains(headB)) return headB;
            nodes.add(headB);
            headB = headB.next;
        }
        return null;
    }
}
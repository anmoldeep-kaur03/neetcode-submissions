/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) 
        return head;

        ListNode tempNode = head;
        if(head.next != null) {
            tempNode = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;
        return tempNode;
    }
}
// If the list is empty, return null.
// Recursively call the function on head.next to reverse the rest of the list.
// After the recursive call returns:
// Make head.next.next = head so the next node points back to the current node.
// Set head.next = null to avoid cycles.
// Return the new head returned by the deepest recursive call.


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
        if(head == null || head.next == null)
        return head;
        ListNode prev = null;
        ListNode tempNode = head;
        while(tempNode != null) {
            ListNode temp = tempNode.next;
            tempNode.next = prev;
            prev = tempNode;
            tempNode = temp;
        }
        return prev;
    }
}
// Initialize:
// prev = null
// curr = head
// While curr exists:
// Save the next node: temp = curr.next
// Reverse the pointer: curr.next = prev
// Move prev to curr
// Move curr to temp
// When the loop ends, prev is the new head of the reversed list.
// Return prev.


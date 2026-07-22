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
// prev curr next
// 1 2
//null <-1 <-2 3-> 4
// store next
// make curr ka next prev
// make prev curr
// make current next
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head; //2
        ListNode prev = null; //null
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;  
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}



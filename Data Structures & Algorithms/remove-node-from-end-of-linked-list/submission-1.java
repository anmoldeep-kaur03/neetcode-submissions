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
//1 2 3 4 5 6 7 8 9
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n==1){
            return null;
        }
        ListNode first = head;
        int count = 0;
        while(first != null){
            count++;
            first = first.next;
        }
        if(n==count){
            return head.next;
        }
        first = head;
        while(count-n-1>0){
            first = first.next;
            count--;
        }
        System.out.println(first.val);
        first.next = first.next.next;
        return head;
    }
}

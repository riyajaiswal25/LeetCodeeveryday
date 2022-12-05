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
    public ListNode middleNode(ListNode head) {
        if(head == null)
            return head;
        int len=0;
        ListNode curr=head;
        while(curr != null)
        {
            len++;
            curr=curr.next;
        }
        len=len/2;
        curr=head;
        while(len > 0)
        {
            curr = curr.next;
            len--;
        }
        return curr;
        
    }
}
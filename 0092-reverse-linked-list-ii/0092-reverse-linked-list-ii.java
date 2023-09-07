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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode it=dummy;
        ListNode prevIt=null;
        for(int i=0;i<left;i++)
        {
            prevIt=it;
            it=it.next;
        }
        ListNode itR=it;
        ListNode prevR=prevIt;
        for(int i=left;i<=right;i++)
        {
            ListNode fwd=itR.next;
            itR.next=prevR;
            prevR=itR;
            itR=fwd;
        }
        prevIt.next=prevR;
        it.next=itR;
        return dummy.next;
    }
}
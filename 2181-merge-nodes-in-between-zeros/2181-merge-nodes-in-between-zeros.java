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
    public ListNode mergeNodes(ListNode head) {
       
        ListNode ans=new ListNode(0);
        int sum=0;
        ListNode curr=head.next;
        ListNode res=ans;
        while(curr!=null)
        {
          
            if(curr.val != 0){
                sum+=curr.val;
                curr=curr.next;
            }
            if(curr.val == 0)
            {
                res.next=new ListNode(sum);
                res=res.next;
                sum=0;
                curr=curr.next;
            }
        }
        
        return ans.next;
        
    }
}
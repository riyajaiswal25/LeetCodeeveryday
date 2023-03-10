/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        HashSet<ListNode> set=new HashSet<>();
        ListNode ptr=head;
        while(ptr!=null && !set.contains(ptr))
        {
            set.add(ptr);
            ptr=ptr.next;
        }
        return ptr;
        
    }
}
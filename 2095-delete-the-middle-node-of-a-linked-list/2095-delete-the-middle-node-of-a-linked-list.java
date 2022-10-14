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
    public ListNode deleteMiddle(ListNode head) {
        int len = getLength(head);
        
        if (len < 1) return head.next;
        
        int i = 0;
        ListNode temp = head;
        int mid = len%2 == 0 ? len/2 - 1 : len/2;

        while (i < mid) {
            i += 1;
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
    
    int getLength(ListNode list) {
        int length = 0;
        ListNode temp = list;
        
        while (temp.next != null) {
            temp = temp.next;
            length += 1;
        }
        
        return length;
    }
}
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
    public int pairSum(ListNode head) {
        ListNode slow = head;
       ListNode fast  = head;
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       ListNode prev = null;
       ListNode current = slow;
       while(current != null){
           ListNode second = current.next;
           current.next = prev;
           prev = current;
           current = second;
       }
       ListNode node1 = prev;
       ListNode node2 = head;
       int max = Integer.MIN_VALUE;
       while(node1 != null && node2 != null){
           int sum = node1.val + node2.val;
           if(sum> max){
               max = sum;
           }
           node1 = node1.next;
           node2 = node2.next;
       }
       return max;
    }
}
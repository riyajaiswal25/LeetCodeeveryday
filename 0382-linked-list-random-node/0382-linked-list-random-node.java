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

    public int length = 1 ;
    public ListNode Head = null ;
    public Solution(ListNode head) {
        Head = head ;
        ListNode curr = head ;
        while(curr != null){
            length++ ;
            curr = curr.next ;
        }
    }
    public int helper(ListNode head , int index){
        ListNode curr = head ;
        int temp = head.val;
        while(curr != null && index != 0){
           temp = curr.val ;
           curr = curr.next ;
           index-- ;
        }
        return temp ;
    }
    
    public int getRandom() {
       int index =  (int) ((Math.random() * (length - 1)) + 1);
        return helper(Head , index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
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
    public ListNode swapNodes(ListNode head, int k) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        int[] arr=new int[c];
        temp=head;
        for(int i=0;i<c;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        int tmp=arr[k-1];
        arr[k-1]=arr[c-k];
        arr[c-k]=tmp;
        temp=head;
        int i=0;
        while(temp!=null)
        {
            temp.val=arr[i++];
            temp=temp.next;
        }
        return head;
    }
}
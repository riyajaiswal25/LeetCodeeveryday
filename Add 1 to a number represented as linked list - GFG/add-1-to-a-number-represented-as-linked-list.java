//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node tail=null;
        while(curr!=null)
        {
            tail=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tail;
            
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        head=reverse(head);
        Node curr=head;
        boolean f=true;
        while(curr!=null && f==true)
        {
            if(curr.next==null && curr.data==9)
            {
                curr.data=1;
                Node temp=new Node(0);
                temp.next=head;
                head=temp;
                curr=curr.next;
            }
            else if(curr.data==9)
            {
                curr.data=0;
                curr=curr.next;
            }
            else
            {
                curr.data=curr.data+1;
                curr=curr.next;
                f=false;
            }
        }
        head=reverse(head);
        return head;
    }
}

//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    public static Node reverse(Node head)
    {
        Node tail=null;
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            tail=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tail;
        }
        return prev;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first=reverse(first);
        second=reverse(second);
        int c=0, s=0;
        Node temp;
        Node res=null;
        Node curr=null;
        while(first!=null || second!=null)
        {
            s=c+((first!=null)?first.data:0)+((second!=null)?second.data:0);
            c=(s>=10)?1:0;
            s=s%10;
            temp=new Node(s);
            if(res==null)
            res=temp;
            else
                curr.next=temp;
                curr=temp;
            if(first!=null)
            first=first.next;
            if(second!=null)
            second=second.next;
        }
        if(c>0)
        {
            temp=new Node(c);
            curr.next=temp;
            curr=temp;
        }
        res=reverse(res);
        return res;
    }
}
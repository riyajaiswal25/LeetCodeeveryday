//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Zeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            Node curr=null;
            while(n-->0){
                int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                    curr=head;
                }
                else{
                    Node temp=new Node(a);
                    temp.next=null;
                    curr.next=temp;
                    curr=temp;
                }
            }
            GfG g=new GfG();
            head = g.moveZeroes(head);
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class GfG{
    public Node moveZeroes(Node head){
        //Your Code here.
        if(head==null || head.next==null)
        return head;
        Node nz=new Node(-1);
        Node z=new Node(-1);
        Node curr=head;
        Node a=nz;
        Node b=z;
        int c=0;
        while(curr!=null)
        {
            if(curr.data==0)
            {
                b.next=curr;
                b=b.next;
                c++;
            }
            else{
                a.next=curr;
                a=a.next;
            }
            curr=curr.next;
        }
        if(c==0)
        return head;
        head=z.next;
        b.next=nz.next;
        a.next=null;
        return head;
        
    }
}
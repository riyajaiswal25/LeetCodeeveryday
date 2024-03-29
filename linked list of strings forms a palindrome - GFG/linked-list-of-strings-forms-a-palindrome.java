//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    String data;
    Node next;
    Node(String key)
    {
        data = key;
        next = null;
    }
}

class Palindrome
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String a = sc.next();
            Node head = new Node(a);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                String a1 = sc.next();
                addToTheLast(new Node(a1));
            }
            
            GfG gfg = new GfG();
            boolean res = gfg.compute(head);
            if(res == true)
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
                 temp = temp.next;
                 temp.next = node;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    String data;
    Node next;
    Node(String key)
    {
        data = key;
        next = null;
    }
}*/
class GfG
{
    public static boolean checkpal(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean compute(Node node)
    {
        StringBuilder sb=new StringBuilder();
        while(node!=null)
        {
            sb.append(node.data);
            node =node.next;
        }
        boolean res=checkpal(sb.toString());
        return res;
    }
}

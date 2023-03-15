/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);           
        boolean found_null = false;   
        while (!q.isEmpty()) 
        {                
            TreeNode node = q.remove();               
            if (node == null)
                found_null = true;  
            else 
            {                       
                if(found_null)          
                    return false;           
                q.add(node.left);      
                q.add(node.right);     
            }
        }
        return true;
    }
}
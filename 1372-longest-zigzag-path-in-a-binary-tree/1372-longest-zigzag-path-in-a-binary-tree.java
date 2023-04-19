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
    int maxlen=0;
    void solve(TreeNode node, boolean leftdir, int currpath)
    {
        if(node==null)
            return;
        maxlen=Math.max(maxlen,currpath);
        if(leftdir==true)
        {
            solve(node.left,false,currpath+1);
            solve(node.right,true,1);
        }
        else
        {
            solve(node.right,true,currpath+1);
            solve(node.left,false,1);
        }
        return;
    }
    public int longestZigZag(TreeNode root) {
        solve(root,true,0);
        solve(root,false,0);
        return maxlen;
    }
}
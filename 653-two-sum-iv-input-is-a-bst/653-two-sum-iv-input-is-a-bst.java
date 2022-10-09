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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> l = new ArrayList<>();
        solve(root,l);
        Collections.sort(l);
        int i=0, j=l.size()-1;
        while(i<j){
            int sum=l.get(i)+l.get(j);
            if(sum==k)
                return true;
            else if(sum>k)
                j--;
            else
                i++;
        }
        return false;
    }
    public static void solve(TreeNode root, List<Integer> l)
    {
        if(root==null)
            return;
        solve(root.left,l);
        l.add(root.val);
        solve(root.right,l);
    }
}
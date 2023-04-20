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
    public int widthOfBinaryTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList();
        HashMap<TreeNode,Integer> map = new HashMap();
        q.add(root);
        map.put(root,1);
        int currW=0;
        int maxW=0;
        while(!q.isEmpty()) {
            int size=q.size();
            int start=0;
            int end=0;
            for(int i=0;i<size;i++) {
                TreeNode node = q.poll();
                int pos=map.get(node);
                if(i==0)
                    start=pos;
                if(i==size-1)
                    end=pos;
                if(node.left!=null) {
                    map.put(node.left,2*pos);
                    q.add(node.left);
                }
                if(node.right!=null) {
                    map.put(node.right,2*pos+1);
                    q.add(node.right);
                }
            }
            currW = end-start+1;
            maxW=Math.max(maxW,currW);
        }
        return maxW;
    }
}
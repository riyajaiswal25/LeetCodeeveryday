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
     public int sumNumbers(TreeNode root) {
        // takes root and initial sum (which is 0 at the start)
        return inorder(root, 0);
    }
    private int inorder(TreeNode root, int num) {
        // we reached to root of tree
        if (root.left == null && root.right == null) return num * 10 + root.val;
        
        num = num * 10 + root.val;
        int left = 0;
        int right = 0;
        // computing left sub tree
        if (root.left != null) {
            left += inorder(root.left, num);
        }
        // computing right sub tree
        if (root.right != null) {
            right += inorder(root.right, num);
        }
        // adding values of both sub trees
        return left + right;
    }
}
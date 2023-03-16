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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < postorder.length; i++){
            stack.push(postorder[i]);
        }

        for(int i = 0 ; i < inorder.length; i++){
            map.put(inorder[i],i);
        }

        return buildTreeHelper(0, postorder.length-1, stack, map);
    }

    public TreeNode buildTreeHelper(int start, int end, Stack<Integer> stack, HashMap<Integer, Integer> map){
        if(start > end){
            return null;
        }

        int num = stack.pop();
        int index = map.get(num);

        TreeNode root = new TreeNode();
        root.val = num;

        root.right = buildTreeHelper(index+1, end, stack, map);
        root.left = buildTreeHelper(start, index-1, stack, map);
        return root;
    }
}
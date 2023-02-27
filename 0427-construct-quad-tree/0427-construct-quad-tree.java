/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {
    public Node construct(int[][] grid) {
        
       int m = grid.length;
        
        return helper(0,m,0,m,grid);
        
    }
    
    public Node helper(int left,int right,int top,int bottom,int[][] grid){

        //return when you find each cell as grid
        if(right - left == 1 && bottom - top == 1){
            return new Node(grid[top][left] == 1,true);
        }
        
        //get the new bottom
        int newBottom =(top + bottom) / 2;
        int newRight = (left + right) / 2;

        Node newNode;
        
         //top left
         Node topLeft = helper(left,newRight,top,newBottom,grid);
        
        //top right
         Node topRight = helper(newRight,right,top,newBottom,grid);
        
        //bottom left
         Node bottomLeft = helper(left,newRight,newBottom,bottom,grid);
        
        //bottom right
         Node bottomRight = helper(newRight,right,newBottom,bottom,grid);
        
        //apply the simulation when every value is same and then it is Leaf
        if(topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val && topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf){
            newNode = new Node(topLeft.val,true);
        }else{
            //if not then just create the node with making those as child node
            newNode = new Node(true,false,topLeft,topRight,bottomLeft,bottomRight);
        }
        
        
        return newNode;
    }
    
    
}
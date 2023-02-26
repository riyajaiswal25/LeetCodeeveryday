class Solution {
  int dp[][];
    public int minDistance(String x, String y) {
      
      dp=new int[x.length()][y.length()];
      for(int[]i:dp){
        Arrays.fill(i,-1);
      }
      return findMin(x.length()-1,y.length()-1,x,y);
    }
  
  public int findMin(int i,int j,String word1,String word2){
    
    if(i<0)return j+1; //suppose word 1 is exhausted that means it is pointing to -1 char which doesnt exsist  still j+1 char are left which can be achieved by adding those char so did this 
    if(j<0)return i+1;
    //suppose word2 is exhausted than minimum operation needed for converting to empty string.
    
    if(dp[i][j]!=-1)return dp[i][j];
    
    char c1=word1.charAt(i);
    char c2=word2.charAt(j);
    
  
    
    if(c1==c2){
      return dp[i][j]=0+findMin(i-1,j-1,word1,word2);
    }
                                           //insert   //delete //replace
      return dp[i][j]=1+Math.min(findMin(i,j-1,word1,word2),Math.min(findMin(i-1,j,word1,word2),findMin(i-1,j-1,word1,word2)));
    
//inserting element that means currrent char had been inserted now for the next call we will just decrement the j we didnt do for i as because the curent char which is pointed out by i could be matched with next char by j .
    //observe the replace if we replace than both pointer should be decremented 
    //while on deleting i must be decremeneted.
  }
}
class Solution {
    public int numSimilarGroups(String[] strs) {
        int ans=0;
        boolean isVisited[]=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(!isVisited[i]){
              ans++;
              Dfs(strs,isVisited,i);
            }
        }
        return ans;
    }

    private void Dfs(String[] strs,boolean[] isVisited,int index){
      isVisited[index]=true;
       for(int i=0;i<strs.length;i++){
            if(similar(strs[index],strs[i])&&!isVisited[i]){
              Dfs(strs,isVisited,i);
            }
        }
    }

    private boolean similar(String str1,String str2){
        int count=0;
        for(int i=0;i<str1.length();i++){
           if(str1.charAt(i)!=str2.charAt(i)) count++;
        }
        if(count==0||count==2) return true;
        return false;
    }
}
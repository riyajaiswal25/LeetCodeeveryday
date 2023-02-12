class Solution {
     List<List<Integer>>graph=new ArrayList<>();
     boolean[]visited;
     long res=0L;
    public long minimumFuelCost(int[][] roads, int seats) {
     
      visited=new boolean[roads.length+1];
      
      for(int i=0;i<roads.length+1;i++){
        graph.add(new ArrayList<Integer>());
      }
      
      for(int i[]:roads){
        graph.get(i[0]).add(i[1]);
        graph.get(i[1]).add(i[0]);
      }
      dfs(0,seats);
      return res;
    }
  
  public int dfs(int node,int seats){
     
    int count=1;
    
    visited[node]=true;
    
    for(int i:graph.get(node)){
      if(!visited[i]){
        count+=dfs(i,seats);
      }
    }
    
    if(node!=0){
      if(count<=seats){
        res+=1;
      }
      else{
        res+=Math.ceil((double)count/seats);//checking how many car do we needs.
      }
    }
    return count;//count will return how many node does it had that is no of child nodes including itself that's why count is initialized as 1. 
  }
}
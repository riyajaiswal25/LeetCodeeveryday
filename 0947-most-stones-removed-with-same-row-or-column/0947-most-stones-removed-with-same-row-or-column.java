class Solution {
    public int removeStones(int[][] stones) {
        Set<int[]> visited=new HashSet<>();
        int connectedStones = 0;
        for(int[] currentStones: stones) {
          if(!visited.contains(currentStones)) {
              dfs(currentStones, visited, stones);
              connectedStones++;
          }
        }
        return stones.length - connectedStones;   
    }
    
    private void dfs(int[] currentStones, Set<int[]> visited, int[][] stones) {
        visited.add(currentStones);
        for(int[] stoneArray: stones) {
            if(!visited.contains(stoneArray)) {
                if(currentStones[0] == stoneArray[0] || currentStones[1] == stoneArray[1]) {
                    dfs(stoneArray, visited, stones);  
                }
            }
        }
    }      
}
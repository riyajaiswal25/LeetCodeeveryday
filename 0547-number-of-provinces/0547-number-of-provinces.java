class Solution {
    int[] visit;
    int[][] c;
    int n;
    Stack<Integer> s1=new Stack<>();
    void dfs(){
        int i=s1.pop();
        visit[i]=1;
        for(int j=0;j<n;j++){
            if(c[i][j]==1 && visit[j]==0){
                s1.push(j);
                dfs();
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        n=isConnected.length;
        c=isConnected;
        int group=1;
        visit=new int[n];
        Arrays.fill(visit,0);
        s1.push(0);
        dfs();
        for(int i=0;i<n;i++){
            if(visit[i]==0){
                group++;
                s1.push(i);
                dfs();
            }
        }
        return group;
    }
}
class Solution {
    // Disjoint Set
    private int findParent(int parent[], int u) {
        if(parent[u] < 0)
            return u;
        return parent[u] = findParent(parent,parent[u]);
    }

    private boolean unionByWeight(int parent[], int u, int v) {
        int pu = findParent(parent,u), pv = findParent(parent,v);
        if(pu == pv)
            return false;
        if(parent[pu] < parent[pv]) {
            parent[pu] += parent[pv];
            parent[pv] = pu;
        }
        else {
            parent[pv] += parent[pu];
            parent[pu] = pv;
        }
        return true;
    }

    public Pair<Integer,Integer> findNetworks(int n, int[][] isConnected) {
        int parent[] = new int[n];
        Arrays.fill(parent,-1);
        int provinces = 0, waste = 0;
        for(int cable[]: isConnected)
            if(!unionByWeight(parent,cable[0],cable[1]))
                waste++;
        for(int i = 0;i < n; i++)
            if(parent[i] < 0)
                provinces++;
        return new Pair(provinces,waste);
    }
    
    public int makeConnected(int n, int[][] connections) {
        Pair<Integer,Integer> ret = findNetworks(n,connections);
        int sets = ret.getKey().intValue(), extra = ret.getValue().intValue();
        int cost = sets - 1;
        if(cost > extra)
            return -1;
        return cost;
    }
}
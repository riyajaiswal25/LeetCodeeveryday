class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inDegrees = new int[n];
        List<Integer> res = new ArrayList<>();

        for(List<Integer> edge : edges)
            inDegrees[edge.get(1)]++;

        for(int i=0; i<n; i++)
        {
            if(inDegrees[i]==0)
                res.add(i);
        }

        return res;
    }
}
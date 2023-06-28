class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
         List<List<Pair>> graph = buildGraph(n, edges, succProb);
        double[] distance = new double[n];
        distance[start] = 1.0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.probability, a.probability));
        pq.offer(new Pair(start, 1.0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            double prob = curr.probability;

            if (node == end) {
                return prob;
            }

            if (prob < distance[node]) {
                continue;
            }

            for (Pair neighbor : graph.get(node)) {
                int nextNode = neighbor.node;
                double nextProb = neighbor.probability;
                double newProb = prob * nextProb;

                if (newProb > distance[nextNode]) {
                    distance[nextNode] = newProb;
                    pq.offer(new Pair(nextNode, newProb));
                }
            }
        }

        return 0.0;
    }

    private List<List<Pair>> buildGraph(int n, int[][] edges, double[] succProb) {
        List<List<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];

            graph.get(u).add(new Pair(v, prob));
            graph.get(v).add(new Pair(u, prob));
        }

        return graph;
    }

    class Pair {
        int node;
        double probability;

        public Pair(int node, double probability) {
            this.node = node;
            this.probability = probability;
        }
    }
}
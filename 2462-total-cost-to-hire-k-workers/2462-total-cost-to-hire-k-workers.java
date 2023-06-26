class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int len = costs.length;
        if (len == 1) return costs[0];
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int i = 0, j = len - 1;

        while (candidates > 0 && i < j) {
            pq1.offer(costs[i++]);
            pq2.offer(costs[j--]);
            candidates--;
        }
        if (len % 2 != 0 && i == j && candidates != 0) pq1.offer(costs[i++]);

        long answer = 0;
        while (k > 0) {
            //System.out.println(pq1.peek() + " " + pq2.peek());
            if (!pq2.isEmpty() && (pq1.isEmpty() || pq1.peek() > pq2.peek())) {
                answer += pq2.poll();
                if (i <= j) pq2.offer(costs[j--]);
            } else {
                answer += pq1.poll();
                if (i <= j) pq1.offer(costs[i++]);
            }
            k--;
        }

        return answer;
    }
}
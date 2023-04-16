class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
            return stones[0];
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones)
            q.add(n);
        while(q.size()>1)
        {
            int polled=q.remove();
            if(q.peek()==polled)
                q.remove();
            else if(q.peek()!=polled)
            {
                int s=q.peek();
                q.remove();
                q.add(Math.abs(s-polled));
            }
        }
        return q.isEmpty()?0:q.remove();
    }
}
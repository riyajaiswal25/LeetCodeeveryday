class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int num:nums)
        {
            pq.offer(num);
        }
        k--;
        while(k-- > 0)
        {
            pq.poll();
        }
        
        return pq.poll();
    }
}
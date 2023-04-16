class Solution {
    public int findKthLargest(int[] nums, int k) {
        int size=nums.length-(k-1);
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int num:nums)
        {
            pq.offer(num);
            if(pq.size()>size)
                pq.poll();
        }
        return pq.poll();
    }
}
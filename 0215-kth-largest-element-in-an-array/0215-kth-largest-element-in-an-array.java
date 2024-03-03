class Solution {
    public int findKthLargest(int[] nums, int k) {
        var pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(var i:nums)
        pq.offer(i);
        int count=0;
        while(count<k-1){
            count+=1;
            pq.poll();
        }
        return pq.poll();
    }
}
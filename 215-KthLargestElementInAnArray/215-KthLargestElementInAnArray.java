// Last updated: 04/04/2026, 23:35:47
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            minHeap.offer(num);
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
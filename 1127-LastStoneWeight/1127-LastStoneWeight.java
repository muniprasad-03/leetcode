// Last updated: 04/04/2026, 23:32:05
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int w : stones) maxHeap.offer(w);
        while(maxHeap.size() >= 2) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if(x != y) {
                maxHeap.offer(y-x);
            } 
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
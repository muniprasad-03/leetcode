// Last updated: 04/04/2026, 23:32:24
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a,b)-> Integer.compare(
                b[0]*b[0]+b[1]*b[1],
                a[0]*a[0]+a[1]*a[1]
            )
        );
        for(int[] point : points) {
            maxHeap.offer(point);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        for(int i=0;i<k;i++) {
            ans[i] = maxHeap.poll();
        }
        return ans;
    }
}

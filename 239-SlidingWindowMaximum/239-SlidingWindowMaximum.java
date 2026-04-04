// Last updated: 04/04/2026, 23:35:20
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int idx = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b)-> {
            return Integer.compare(nums[b],nums[a]);
        });
        int[] ans = new int[n-k+1];
        for(i=0;i<k;i++) {
            maxHeap.add(i);
        }
        ans[idx++] = nums[maxHeap.peek()];
        for(int r = i;r<n;r++) {
            maxHeap.add(r);
            while(r-maxHeap.peek()+1 > k)  {
                maxHeap.poll();
            }
            ans[idx++] = nums[maxHeap.peek()];
        }
        return ans;
    }
}
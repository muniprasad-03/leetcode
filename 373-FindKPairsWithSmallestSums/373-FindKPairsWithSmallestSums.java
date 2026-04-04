// Last updated: 04/04/2026, 23:34:43
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a,b) -> a[0] - b[0]
            );
        List<List<Integer>> ans = new ArrayList<>(k);
        minHeap.add(new int[]{nums1[0]+nums2[0],0,0});
        HashSet<String> set = new HashSet<>();
        set.add("0,0");
        while(ans.size() < k && !minHeap.isEmpty()) {
            int[] minPair = minHeap.poll();
            int sum = minPair[0];
            int i = minPair[1];
            int j = minPair[2];
            ans.add(Arrays.asList(nums1[i], nums2[j]));
            if(i<nums1.length && j+1<nums2.length && set.add(i+","+(j+1)))
            minHeap.add(new int[]{nums1[i]+nums2[j+1],i,j+1});
            if(i+1<nums1.length && j<nums2.length && set.add((i+1)+","+j))
            minHeap.add(new int[]{nums1[i+1]+nums2[j],i+1,j});
        }
        return ans;
    }
}
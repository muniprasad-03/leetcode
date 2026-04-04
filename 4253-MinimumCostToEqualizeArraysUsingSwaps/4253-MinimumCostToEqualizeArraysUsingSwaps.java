// Last updated: 04/04/2026, 23:26:07
class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, Integer> total = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i=0;i<n;i++) {
            total.put(nums1[i], total.getOrDefault(nums1[i], 0)+1);
            total.put(nums2[i], total.getOrDefault(nums2[i], 0)+1);
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0)+1);
        }
        int ans = 0;
        for(int val : total.keySet()) {
            int t = total.get(val);
            if(t % 2 != 0) return -1;
            int tar = t/2;
            int curr = map1.getOrDefault(val, 0);
            if(curr > tar) {
                ans += (curr - tar);
            }
        }
        return ans;
    }
}
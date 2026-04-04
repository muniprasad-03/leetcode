// Last updated: 04/04/2026, 23:34:56
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] seen = new int[1001];
        for(int num : nums1) seen[num] = 1;
        List<Integer> ansList = new ArrayList<>();
        for(int num : nums2) {
            if(seen[num]==1) {
                ansList.add(num);
                seen[num]=2;
            }
        }
        int n = ansList.size();
        int[] ans = new int[n];
        for(int i=0;i<n;i++) ans[i] = ansList.get(i);
        return ans;
    }
}
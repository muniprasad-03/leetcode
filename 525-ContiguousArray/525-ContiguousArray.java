// Last updated: 04/04/2026, 23:33:54
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0;
        for(int i=0;i<n;i++) {
            prefixSum += (nums[i] == 1) ? 1 : -1;
            if(map.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}
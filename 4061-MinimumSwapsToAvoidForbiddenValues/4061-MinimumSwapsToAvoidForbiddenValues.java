// Last updated: 04/04/2026, 23:27:45
class Solution {
    public int minSwaps(int[] nums, int[] forbidden) {
        int n = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        Map<Integer, Integer> forbidMap = new HashMap<>();
        Map<Integer, Integer> violMap = new HashMap<>();
        int totViolations=0;
        for(int i=0;i<n;i++) {
            numMap.put(nums[i], numMap.getOrDefault(nums[i],0)+1);
            forbidMap.put(forbidden[i], forbidMap.getOrDefault(forbidden[i],0)+1);
            if(nums[i] == forbidden[i]) {
                totViolations++;
                    violMap.put(nums[i], violMap.getOrDefault(nums[i],0)+1);
            }
        }
        for(int val : numMap.keySet()) {
            if(numMap.get(val)+forbidMap.getOrDefault(val,0)>n) {
                return -1;
            }
        }
        if(totViolations==0) return 0;
        int maxViolations = 0;
        for(int cnt : violMap.values()) {
            maxViolations = Math.max(maxViolations, cnt);
        }
        return Math.max(maxViolations, (totViolations+1)/2);
    }
}
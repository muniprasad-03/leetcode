// Last updated: 04/04/2026, 23:28:41
class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int maxLen = 0;
        int currXor = 0;
        int currDiff = 0;
        Map<String,Integer> mp = new HashMap<>();
        mp.put("0,0",-1);
        for(int i=0;i<nums.length;i++) {
            currXor ^= nums[i];
            if(nums[i]%2 != 0) {
                currDiff++;
            } else {
                currDiff--;
            }
            String key = currXor+","+currDiff;
            if(mp.containsKey(key)) {
                maxLen = Math.max(maxLen,i-mp.get(key));
            } else {
                mp.put(key,i);
            }
        }
        return maxLen;
    }
}
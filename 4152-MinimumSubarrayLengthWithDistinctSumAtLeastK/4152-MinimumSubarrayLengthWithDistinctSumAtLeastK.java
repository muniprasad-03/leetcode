// Last updated: 04/04/2026, 23:27:00
class Solution {
    public int minLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++) {
            if(map.getOrDefault(nums[r],0)==0) {
                sum += nums[r];
            }
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);
            while(sum >= k) {
                minLen = Math.min(minLen, r-l+1);
                map.put(nums[l], map.get(nums[l])-1);
                if(map.get(nums[l])==0) {
                    sum -= nums[l];
                }
                l++;
            }
        }
        return (minLen==Integer.MAX_VALUE)? -1 : minLen;
    }
}
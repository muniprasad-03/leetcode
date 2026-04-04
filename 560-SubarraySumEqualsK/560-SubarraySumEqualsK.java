// Last updated: 04/04/2026, 23:33:48
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int currSum = 0;
        int ans = 0;
        map.put(0, 1);
        for(int num : nums) {
            currSum += num;
            if(map.containsKey(currSum-k)) {
                ans += map.get(currSum-k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }
        return ans;
    }
}
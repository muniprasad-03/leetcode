// Last updated: 04/04/2026, 23:33:55
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int currSum = 0;
        map.put(0, -1);
        for(int i=0;i<nums.length; i++) {
            currSum = currSum + nums[i];
            int rem = currSum % k;
            if(map.containsKey(rem)) {
                if(i - map.get(rem) >= 2) return true;
            } else {
                map.put(rem , i);
            }
        }
        return false;
    }
}
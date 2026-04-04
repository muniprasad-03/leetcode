// Last updated: 04/04/2026, 23:39:16
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int key = target - nums[i];
            if(map.containsKey(key)) {
                return new int[]{i, map.get(key)};
            }
            map.put(nums[i], i);
        } 
        return new int[]{0, 0};
    }
}
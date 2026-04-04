// Last updated: 04/04/2026, 23:36:13
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key)>(n/2)) return key;
        }
        return -1;
    }
}
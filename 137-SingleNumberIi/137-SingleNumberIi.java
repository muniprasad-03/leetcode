// Last updated: 04/04/2026, 23:36:43
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==3) map.remove(num);
        }
        for(int num:map.keySet()) {
            return num;
        }
        return -1;
    }
}
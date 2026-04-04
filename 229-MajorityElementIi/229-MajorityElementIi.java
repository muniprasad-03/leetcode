// Last updated: 04/04/2026, 23:35:33
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int freqNeeded = nums.length/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : map.keySet()) {
            int freq = map.get(num);
            if(freq > freqNeeded) ans.add(num);
        }
        return ans;
    }
}
// Last updated: 04/04/2026, 23:28:25
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if(n%k!=0) return false;
        Map<Integer,Integer> frq = new HashMap<>();
        for(int num:nums) {
            frq.put(num,frq.getOrDefault(num,0)+1);
        }
        int grpCount = n/k;
        for(int cnt : frq.values()) {
            if(cnt>grpCount) return false;
        }
        return true;
    }
}
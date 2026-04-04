// Last updated: 04/04/2026, 23:29:56
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int totalUnqNums = set.size();
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++) {
            set = new HashSet<>();
            for(int j=i;j<n;j++) {
                set.add(nums[j]);
                if(set.size() == totalUnqNums) ans++;
            }
        }
        return ans;
    }
}
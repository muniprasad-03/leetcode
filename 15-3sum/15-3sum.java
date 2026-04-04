// Last updated: 04/04/2026, 23:38:59
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int num1 = nums[i];
            int left = i+1;
            int right = n-1;
            while(left < right) {
                int sum = nums[left] + nums[right];
                if(num1 + sum == 0) {
                    ans.add(Arrays.asList(num1, nums[left], nums[right]));
                    while(left < n-1 && nums[left]==nums[left+1]) left++;
                    while(right > 0 && nums[right]==nums[right-1]) right--; 
                    left++;
                    right--; 
                } else if (num1 + sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }
}
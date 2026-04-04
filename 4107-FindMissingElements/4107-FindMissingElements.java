// Last updated: 04/04/2026, 23:27:29
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] != nums[i]-1) {
                for(int missed=nums[i-1]+1;missed<nums[i];missed++) {
                    ans.add(missed);
                }
            }
        }
        return ans;
    }
}
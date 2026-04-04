// Last updated: 04/04/2026, 23:37:43
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int noOfSubsets = (1 << n);
        for(int num = 0; num < noOfSubsets; num++) {
            List<Integer> subSet = new ArrayList<>();
            int temp = num;
            for(int i=0;i<n;i++) {
                boolean isSetBit = (temp&1)==1;
                if(isSetBit) subSet.add(nums[i]);
                temp >>= 1;
            }
            ans.add(subSet);
        }
        return ans;
    }
}
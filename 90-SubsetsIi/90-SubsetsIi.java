// Last updated: 04/04/2026, 23:37:32
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private void backtrack(int idx, List<Integer> list, int[] nums) {
        if(idx == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        backtrack(idx+1, list, nums);
        list.remove(list.size()-1);
        while(idx+1 < nums.length && nums[idx] == nums[idx+1]) idx++;
        backtrack(idx+1, list, nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        backtrack(0, list, nums);
        return ans;
    }
}
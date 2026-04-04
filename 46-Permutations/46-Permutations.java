// Last updated: 04/04/2026, 23:38:19
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    private void backtrack(int idx, List<Integer> perm, boolean[] vis, int[] nums) {
        if(perm.size() == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(!vis[i]) {
                vis[i] = true;
                perm.add(nums[i]);
                backtrack(idx+1, perm, vis, nums);
                perm.remove(perm.size()-1);
                vis[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> perm = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        backtrack(0, perm, vis, nums);
        return ans;
    }
}
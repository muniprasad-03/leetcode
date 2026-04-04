// Last updated: 04/04/2026, 23:38:27
class Solution {
    private void backtrack(int idx, List<Integer> list, int target, int[] candidates, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx == candidates.length || target < 0) {
            return;
        }
        int num = candidates[idx];
        list.add(num);
        backtrack(idx, list, target-num, candidates, ans);
        list.remove(list.size()-1);
        backtrack(idx+1, list, target, candidates, ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(0, list, target, candidates, ans);
        return ans;
    }
}
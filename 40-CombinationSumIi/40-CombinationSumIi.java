// Last updated: 04/04/2026, 23:38:28
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private void backtrack(int idx, List<Integer> list, int target, int[] candidates) {
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx == candidates.length || target < 0) {
            return;
        }
        for(int i=idx; i<candidates.length;i++) {
            if(i>idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) break;
            list.add(candidates[i]);
            backtrack(i+1, list, target-candidates[i], candidates);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        backtrack(0, list, target, candidates);
        return ans;
    }
}
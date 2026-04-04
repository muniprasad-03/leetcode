// Last updated: 04/04/2026, 23:37:44
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private void backtrack(int start, int end, int k, List<Integer> list) {
        if(list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start; i<=end; i++) {
            list.add(i);
            backtrack(i+1, end, k, list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        backtrack(1, n, k, list);
        return ans;
    }
}
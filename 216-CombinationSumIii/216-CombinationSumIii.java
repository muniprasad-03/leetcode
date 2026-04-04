// Last updated: 04/04/2026, 23:35:46
class Solution {
    int k=0;
    public void solve(int num,int sumReq,List<Integer> currList,List<List<Integer>> ans) {
        if(sumReq<0 || currList.size()>k) return;
        if(sumReq==0 && currList.size()==k) {
            ans.add(new ArrayList(currList));
            return;
        }
        for(int i=num;i<=9;i++) {
            currList.add(i);
            solve(i+1,sumReq-i,currList,ans);
            currList.remove(currList.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k=k;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(1,n,curr,ans);
        return ans;
    }
}
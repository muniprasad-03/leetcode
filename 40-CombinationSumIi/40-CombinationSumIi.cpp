// Last updated: 04/04/2026, 23:38:32
class Solution {
public:
    void helper(vector<int>& arr,int idx,vector<int>& currList,int       target,vector<vector<int>>& ansList) {
        if (target == 0) {
            ansList.push_back(currList);
            return;
        }
        for (int i=idx; i<arr.size();i++) {
            if(i>idx && arr[i]==arr[i - 1]) continue;
            if(arr[i]>target) break;

            currList.push_back(arr[i]);
            helper(arr,i+1,currList,target-arr[i],ansList);
            currList.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        vector<vector<int>> ans;
        vector<int> curr;
        helper(candidates,0,curr,target,ans);
        return ans;
    }
};

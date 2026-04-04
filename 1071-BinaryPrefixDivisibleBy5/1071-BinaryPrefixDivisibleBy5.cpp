// Last updated: 04/04/2026, 23:32:11
class Solution {
public:
    vector<bool> prefixesDivBy5(vector<int>& nums) {
        int n = nums.size();
        vector<bool> ans(n);
        int val = 0;
        for(int i=0;i<n;i++) {
            val = ((val<<1)+nums[i]) % 5;
            ans[i] = (val==0);
        }
        return ans;
    }
};
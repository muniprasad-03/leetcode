// Last updated: 04/04/2026, 23:34:52
class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        bool seen[1001] = {false};
        bool added[1001] = {false};
        for(int num : nums1) seen[num] = true;
        vector<int> ans;
        for(int num : nums2) {
            if(seen[num] && !added[num]) {
                ans.push_back(num);
                added[num] = true;
            }
        }
        return ans;
    }
};
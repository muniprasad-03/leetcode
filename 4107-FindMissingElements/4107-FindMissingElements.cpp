// Last updated: 04/04/2026, 23:27:26
class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        int maxi = 1;
        int mini = 100;
        bool set[101] = {false};
        for(int num : nums) {
            set[num] = true;
            mini = min(mini, num);
            maxi = max(maxi,num);
        }
        vector<int> ans;
        for(int i=1;i<=100;i++) {
            if(i>mini && i<maxi && set[i]==false) ans.push_back(i);
        }
        return ans;
    }
};
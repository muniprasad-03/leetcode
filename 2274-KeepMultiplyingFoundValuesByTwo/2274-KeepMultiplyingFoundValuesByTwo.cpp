// Last updated: 04/04/2026, 23:30:28
class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        bool set[2001];
        for(int &num : nums) if(set[num]==false) set[num] = true;
        while(set[original]==true) original*=2;
        return original;
    }
};
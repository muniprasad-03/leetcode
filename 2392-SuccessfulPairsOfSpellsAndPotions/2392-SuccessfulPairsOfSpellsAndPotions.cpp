// Last updated: 04/04/2026, 23:30:14
class Solution {
    public:
    int validSpells(int num,vector<int>& potions,long success) {
        int len = 0;
        int start = 0;
        int end = potions.size()-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if((long)num*potions[mid]>=success) {
                len += (end-mid+1);
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return len;
    }
    vector<int> successfulPairs(vector<int> spells, vector<int> potions, long success) {
        sort(potions.begin(),potions.end());
        int m = spells.size();
        vector<int> ans(m);
        for(int i=0;i<m;i++) {
            ans[i] = validSpells(spells[i],potions,success);
        }
        return ans;
    }
};
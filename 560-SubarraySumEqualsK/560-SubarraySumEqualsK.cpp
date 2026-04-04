// Last updated: 04/04/2026, 23:33:43
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> map;
        map[0]=1;
        int currSum = 0;
        int ans = 0;
        for(int num : nums) {
            currSum += num;
            if(map.find(currSum-k) != map.end()) {
                ans += map[currSum-k];
            }
            map[currSum]++;
        }
        return ans;
    }
};
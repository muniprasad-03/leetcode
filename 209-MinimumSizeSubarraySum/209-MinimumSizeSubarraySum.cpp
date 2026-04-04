// Last updated: 04/04/2026, 23:35:52
class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int i=0;
        int j=0;
        int sum = 0;
        int minLen = INT_MAX;
        while(j<nums.size()) {
            sum += nums[j]; //increase window
            while(sum >= target) { 
                minLen = min(minLen, j-i+1); //decrease window
                sum -= nums[i++];
            }
            j++;
        }
        return minLen==INT_MAX ? 0:minLen;
    }
};
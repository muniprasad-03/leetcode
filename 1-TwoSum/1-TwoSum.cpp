// Last updated: 04/04/2026, 23:39:19
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> hm;
        for(int i=0;i<nums.size();i++){
            hm.insert({nums[i],i});
        }
        for(int i=0;i<nums.size();i++){
            int find=target-nums[i];
            if(hm.count(find)==true && hm[find]!=i){
                return {i,hm[find]};
            }
        }
        return {};
    }
};
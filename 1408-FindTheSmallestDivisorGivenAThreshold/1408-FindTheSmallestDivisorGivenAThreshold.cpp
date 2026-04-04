// Last updated: 04/04/2026, 23:31:44
class Solution {
public:
    bool validate(vector<int>& nums,int threshold,int div) {
        int sum = 0;
        for(int num : nums) {
            sum += ceil((double)num/div);//or (num + div - 1) / div 
        }
        return sum <= threshold;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int start  = 1;
        int end = *max_element(nums.begin(),nums.end());
        while(start < end) {
            int mid = start + (end-start)/2;
            if(validate(nums,threshold,mid)) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
};
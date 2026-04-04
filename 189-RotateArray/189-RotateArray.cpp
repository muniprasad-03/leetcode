// Last updated: 04/04/2026, 23:36:08
class Solution {
public:
    void Reverse(vector<int>& nums,int start,int end)
    {
        while(start<=end)
        {
            swap(nums[start],nums[end]);
            start++;
            end--;
        }
    }
    void rotate(vector<int>& nums, int k) {
        int len=nums.size();
        k=k%len;
        if(k==0) return;
        else
        {
            k=k%len;
            Reverse(nums,0,len-k-1);
            Reverse(nums,len-k,len-1);
            Reverse(nums,0,len-1);
        }
    }
};
// Last updated: 04/04/2026, 23:33:34
class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        vector<int> ans(k);
        int left = 0;
        int right = arr.size()-1;
        while(right-left+1>k) {
            if(abs(arr[left]-x) <= abs(arr[right]-x)) {
                right--;
            } else {
                left++;
            }
        }
        for(int i=left,j=0;i<=right;i++,j++) {
            ans[j] = arr[i];
        }
        return ans;
    }
};
// Last updated: 04/04/2026, 23:34:03
class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        int len1 = nums1.size();
        int len2 = nums2.size();
        vector<int> ans(len1);
        unordered_map<int,int> ngeMap;
        for(int i=0;i<len2;i++) {
            int key = nums2[i];
            int val = -1;
            for(int j=i+1;j<len2;j++) {
                if(nums2[j] > key) {
                    val = nums2[j];
                    break;
                }
            }
            ngeMap[key] = val;
        }
        int idx = 0;
        for(int num : nums1) {
            ans[idx++] = ngeMap[num];
        }
        return ans;
    }
};
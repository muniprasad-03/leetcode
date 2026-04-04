// Last updated: 04/04/2026, 23:31:19
class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int curr = 1;
        int idx = 0;
        int missCnt = 0;
        while(true) {
            if(idx<arr.size() && arr[idx]==curr) {
                idx++;
            } else {
                missCnt++;
                if(missCnt==k) return curr;
            }
            curr++;
        }
    }
};
// Last updated: 04/04/2026, 23:32:19
class Solution {
public:
    bool feasible(vector<int>& weights,int capacity,int days) {
        int temp = 0;
        int day = 1;
        for(int wt : weights) {
            if(temp+wt <= capacity) {
                temp += wt;
            } else {
                day++;
                temp = wt;
                if(day > days) return false;
            }
        }
        return true;
    }
    int shipWithinDays(vector<int>& weights, int days) {
        int start = 0;
        int end = 0;
        for(int wt : weights) {
            start = max(start,wt);
            end += wt;
        }
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(feasible(weights,mid,days)) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
};
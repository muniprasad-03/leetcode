// Last updated: 04/04/2026, 23:32:50
class Solution {
public:
    bool help(vector<int>& piles,int x,int h) {
        long time = 0;
        for(int num : piles) time += (num + x - 1L)/x;
        return time<=h;
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int start = 1;
        int end = *max_element(piles.begin(),piles.end());
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(help(piles,mid,h)) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
};
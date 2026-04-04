// Last updated: 04/04/2026, 23:37:55
class Solution {
public:
    int mySqrt(int x) {
        int start = 0;
        int end = x;
        while(start <= end) {
            int mid = start + (end-start)/2;
            long sq = (long)mid*mid;
            if(sq == x) return mid;
            else if(sq < x) start = mid+1;
            else end = mid-1;
        }
        return end;
    }
};
// Last updated: 04/04/2026, 23:34:46
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        int left = 2;
        int right = num/2;
        while(left <= right) {
            int mid = left + (right-left)/2;
            long s =(long) mid*mid;
            if(s == num) return true;
            else if(s>num) right = mid-1;
            else left = mid+1;
        }
        return false;
    }
}
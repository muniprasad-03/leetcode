// Last updated: 04/04/2026, 23:35:09
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low < high) {
            int mid = low +(high-low)/2;

            if(isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}
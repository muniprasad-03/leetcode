// Last updated: 04/04/2026, 23:26:00
class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        boolean hasOdd = false;
        for(int num : nums1) {
            if(num < minVal) {
                minVal = num;
            }
            if(num % 2 != 0) {
                hasOdd = true;
            }
        }
        if(!hasOdd) return true;
        if(minVal % 2 != 0) return true;
        return false;
    }
}
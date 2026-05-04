// Last updated: 04/05/2026, 23:30:44
class Solution {
    public int compareBitonicSums(int[] nums) {
        long incSum = 0;
        long decSum = 0;
        int i=0;
        int n = nums.length;
        while(i + 1 < n && nums[i] < nums[i+1]) {
            incSum += nums[i];
            i++;
        } 
        i++;
        while(i < n) {
            decSum += nums[i];
            i++;
        } 
        if(incSum > decSum) return 0;
        else if(decSum > incSum) return 1;
        return -1;
    }
}
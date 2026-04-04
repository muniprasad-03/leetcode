// Last updated: 04/04/2026, 23:37:48
class Solution {
    public void sortColors(int[] nums) {
        int l = nums.length;
        int oneCnt = 0;
        int twoCnt = 0;
        int zeroCnt = 0;
        for(int i=0;i<l;i++) {
            if(nums[i] == 1) oneCnt++;
            else if (nums[i] == 2) twoCnt++;
            else zeroCnt++;
        }
        int i=0;
        int j=0;
        for(;j<zeroCnt;j++) nums[i++] = 0;
        j=0;
        for(;j<oneCnt;j++) nums[i++] = 1;
        j=0;
        for(;j<twoCnt;j++) nums[i++] = 2;
    }
}
// Last updated: 04/04/2026, 23:30:36
class Solution {
    public void createSubset(int[] nums,int idx,int currOr,int[] prevOrCnt){
        if(idx==nums.length) {
            if(currOr > prevOrCnt[0]) {
                prevOrCnt[0] = currOr;
                prevOrCnt[1] = 1; 
            } else if(currOr==prevOrCnt[0]) {
                prevOrCnt[1]++;
            }
            return;
        }
        createSubset(nums,idx+1,currOr | nums[idx],prevOrCnt);
        createSubset(nums,idx+1,currOr,prevOrCnt);
    }
    public int countMaxOrSubsets(int[] nums) {
        int[] prevOrCnt = new int[2];
        prevOrCnt[0] = Integer.MIN_VALUE;
        prevOrCnt[1] = 0;
        createSubset(nums,0,0,prevOrCnt);
        return prevOrCnt[1];
    }
}
// Last updated: 04/04/2026, 23:38:22
class Solution {
    private Integer[] memo;
    public int recurse(int idx, int[] nums) {
        if(idx >= nums.length-1) return 0;
        if(memo[idx] != null) return memo[idx];
        int minJump = Integer.MAX_VALUE;
        int maxJump = Math.min(idx + nums[idx], nums.length-1);
        for(int i=idx+1; i<=maxJump; i++) {
            int min = recurse(i, nums);
            if(min != Integer.MAX_VALUE) {   
                minJump = Math.min(min+1, minJump);
            }
        }
        return memo[idx] = minJump;
    }
    public int jump(int[] nums) {
        int n = nums.length;
        this.memo = new Integer[n];
        return recurse(0, nums);
    }
}
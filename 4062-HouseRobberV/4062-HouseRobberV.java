// Last updated: 04/04/2026, 23:27:44
class Solution {
    private long[] cache;
    private long help(int i, int[] nums, int[] colors) {
        if(i<0) return 0;
        if(i==0) return nums[0];
        if(cache[i] != -1) return cache[i];
        long noRob = help(i-1, nums, colors);
        long rob;
        if(colors[i] != colors[i-1]) {
            rob = (long)nums[i]+help(i-1, nums, colors);
        } else {
            rob = (long)nums[i] + help(i-2, nums, colors);
        }
        return cache[i] = Math.max(noRob, rob);
    }
    public long rob(int[] nums, int[] colors) {
        int n = nums.length;
        cache = new long[n];
        Arrays.fill(cache, -1);
        return help(n-1, nums, colors);
    }
}
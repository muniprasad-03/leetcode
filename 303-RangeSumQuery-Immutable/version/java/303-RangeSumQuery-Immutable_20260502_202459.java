// Last updated: 02/05/2026, 20:24:59
1class NumArray {
2    private int[] prefix;
3    public NumArray(int[] nums) {
4        int n = nums.length;
5        this.prefix = new int[n];
6        prefix[0] = nums[0];
7        for(int i=1;i<n;i++) {
8            prefix[i] = prefix[i-1] + nums[i];
9        } 
10    }
11    
12    public int sumRange(int left, int right) {
13        if(left == 0) return prefix[right];
14        return prefix[right] - prefix[left-1];
15    }
16}
17
18/**
19 * Your NumArray object will be instantiated and called as such:
20 * NumArray obj = new NumArray(nums);
21 * int param_1 = obj.sumRange(left,right);
22 */
// Last updated: 02/05/2026, 20:20:33
1class NumArray {
2    private int[] nums;
3    public NumArray(int[] nums) {
4        this.nums = nums;
5    }
6    
7    public int sumRange(int left, int right) {
8        int sum = 0;
9        for(int i=left; i<=right; i++) {
10            sum += nums[i];
11        }
12        return sum;
13    }
14}
15
16/**
17 * Your NumArray object will be instantiated and called as such:
18 * NumArray obj = new NumArray(nums);
19 * int param_1 = obj.sumRange(left,right);
20 */
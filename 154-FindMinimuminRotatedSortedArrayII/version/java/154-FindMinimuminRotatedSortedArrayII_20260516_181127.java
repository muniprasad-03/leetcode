// Last updated: 16/05/2026, 18:11:27
1class Solution {
2    public int findMin(int[] nums) {
3        return Arrays.stream(nums).min().getAsInt();
4    }
5}
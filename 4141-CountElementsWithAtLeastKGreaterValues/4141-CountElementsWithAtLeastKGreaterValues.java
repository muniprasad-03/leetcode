// Last updated: 04/04/2026, 23:27:04
class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int pIdx = n-k;
        if(k==0) return n;
        int pVal = nums[pIdx];
        int qualified = 0;
        for(int i=0;i<n;i++) {
            if(nums[i]<pVal) {
                qualified++;
            } else {
                break;
            }
        }
        return qualified;
    }
}
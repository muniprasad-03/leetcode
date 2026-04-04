// Last updated: 04/04/2026, 23:25:59
class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int sum = 0;
        for(int k = 1;k<=n;k++) {
            if(n%k == 0) {
                if(isSortable(nums, sorted, k)) {
                    sum+=k;
                }
            }
        }
        return sum;
    }
    
    private boolean isSortable(int[] nums, int[] sorted, int k) {
        int n = nums.length;
        for(int i = 0;i<n;i+=k) {
            if(!canRotateToMatch(nums, sorted, i, k)) {
                return false;
            }
        }
        return true;
    }

    private boolean canRotateToMatch(int[] nums, int[] sorted, int start, int k) {
        if(k == 1) return nums[start] == sorted[start];
        int breakCount = 0;
        int breakPoint = -1;
        for(int j = 0;j<k;j++) {
            int curr = start+j;
            int next = start+(j+1)%k;
            if(nums[curr] > nums[start+(j+1)%k]) {
                breakCount++;
                breakPoint =(j+1)%k;
            }
        }
        if(breakCount > 1) return false;
        int offset =(breakCount == 0) ? 0 : breakPoint;
        for(int j = 0;j<k;j++) {
            if(nums[start+(offset+j)%k] != sorted[start+j]) {
                return false;
            }
        }
        return true;
    }
}
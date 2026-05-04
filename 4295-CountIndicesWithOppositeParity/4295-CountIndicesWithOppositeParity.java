// Last updated: 04/05/2026, 23:30:42
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            int oddCnt = 0;
            int evenCnt = 0;
            for(int j=i+1;j<n;j++) {
                if(nums[j] % 2 == 0) {
                    evenCnt++;
                } else {
                    oddCnt++;
                }
            }
            ans[i] = (nums[i] % 2 == 0) ? oddCnt : evenCnt;
        }
        return ans;
    }
}
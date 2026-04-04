// Last updated: 04/04/2026, 23:27:41
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] map = new int[101];
        for(int num : nums){
            map[num]++;
        }
        int ans = 0;
        for(int i=1;i<=100;i++) {
            if(map[i]%k==0) {
                ans += (i*map[i]);
            }
        }
        return ans;
    }
}
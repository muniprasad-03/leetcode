// Last updated: 04/04/2026, 23:28:10
class Solution {
    public int smallestAbsent(int[] nums) {
        Set<Integer> pNums = new HashSet<>();
        long sum=0;
        for(int n:nums) {
            pNums.add(n);
            sum+=n;
        }
        double avg = (double)sum/nums.length;
        int ans = Math.max(1,(int)Math.floor(avg)+1);
        while(true) {
            if(!pNums.contains(ans)) {
                return ans;
            }
            ans++;
        }
    }
}
// Last updated: 04/04/2026, 23:29:30
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        Arrays.sort(happiness);
        int dec = 0;
        for(int i=happiness.length-1;i>=0 && dec<k;i--) {
            int val = happiness[i]-dec;
            if(val>0) {
                ans+=val;
                dec++;
            } else {
                break;
            }
        }
        return ans;
    }
}
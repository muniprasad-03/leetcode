// Last updated: 04/04/2026, 23:28:50
class Solution {
    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        int n=nums.length;
        int[] cnts = new int[n+1];
        for(int num : nums) {
            cnts[num]++;
        }
        int[] suffCnts = new int[n+2];
        for(int i=n;i>=1;i--) {
            suffCnts[i]=suffCnts[i+1]+cnts[i];
        }
        boolean[] cache = new boolean[k+1];
        cache[0]=true;
        boolean[] ans=new boolean[n];
        for(int i=1;i<=n;i++) {
            boolean[] currCache = cache.clone();
            updateDpCopies(currCache,k,i,suffCnts[i]);
            ans[i-1]=currCache[k];
            if(cnts[i]>0) {
                updateDpCopies(cache,k,i,cnts[i]);
            }
        }
        return ans;
    }
    private void updateDpCopies(boolean[] cache,int k,int v,int c) {
        if(v==0 || c==0 || v>k) {
            return;
        }
        int[] used=new int[k+1];
        for(int i=v;i<=k;i++){
            if(cache[i]) {
                used[i]=0;
            }
            else if(cache[i-v]) {
                if(used[i-v]<c) {
                    cache[i]=true;
                    used[i]=used[i-v]+1;
                }
            }
        } 
    }
}
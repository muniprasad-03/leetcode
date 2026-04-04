// Last updated: 04/04/2026, 23:32:38
class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int ans = 0;
        for(int i=0;i<m;i++) {
            boolean isSorted = true;
            for(int j=0;j<n-1;j++) {
                if(strs[j].charAt(i) > strs[j+1].charAt(i)) {
                    isSorted = false;
                    break;
                }
            }
            if(!isSorted) ans++;
        }
        return ans;
    }
}
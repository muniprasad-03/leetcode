// Last updated: 04/04/2026, 23:32:29
class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int ans = 0;
        boolean[] sorted = new boolean[n-1];
        for(int i=0;i<m;i++) {
            boolean sortedCol = true;
            for(int j=0;j<n-1;j++) {
                if(!sorted[j] && strs[j].charAt(i)>strs[j+1].charAt(i)) {
                    sortedCol = false;
                    break;
                }
            }
            if(sortedCol) {
                for(int j=0;j<n-1;j++) {
                    if(strs[j].charAt(i) < strs[j+1].charAt(i)) {
                        sorted[j] = true;
                    }
                }
            } else {
                ans++;
            }
        }
        return ans;
    }
}
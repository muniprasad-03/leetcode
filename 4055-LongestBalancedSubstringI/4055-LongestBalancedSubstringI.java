// Last updated: 04/04/2026, 23:27:48
class Solution {
    public int longestBalanced(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            int[] map = new int[26];
            for(int j=i;j<n;j++) {
                char ch = s.charAt(j);
                map[ch-'a']++;
                int maxF = 0;
                for(int f : map) {
                    if(f!=0 && maxF < f) {
                        maxF=f;
                    }
                }
                boolean balanced = true;
                if(maxF>0) {
                    for(int f : map) {
                        if(f!=0 && f!=maxF) {
                            balanced = false;
                            break;
                        }
                    }
                } else {
                    balanced = false;
                }
                if(balanced) ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}
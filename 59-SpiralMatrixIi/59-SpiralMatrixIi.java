// Last updated: 04/04/2026, 23:38:04
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int num = 1;
        int rs=0;
        int re=n-1;
        int cs=0;
        int ce=n-1;
        int i=0;
        while(rs<=re && cs<=ce) {
            for(i=cs;i<=ce;i++) {
                ans[rs][i] = num++; 
            }
            rs++;
            for(i=rs;i<=re;i++) {
                ans[i][ce] = num++;
            }
            ce--;
            for(i=ce;i>=cs;i--) {
                ans[re][i] = num++;
            }
            re--;
            for(i=re;i>=rs;i--) {
                ans[i][cs]=num++;
            }
            cs++;
        }
        return ans;
    }
}
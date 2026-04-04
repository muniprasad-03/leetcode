// Last updated: 04/04/2026, 23:38:01
class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<vector<int>> chache(m,vector<int>(n,0));
        for(int i=0;i<m;i++) chache[i][0] = 1;
        for(int i=0;i<n;i++) chache[0][i] = 1;
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                chache[i][j] = chache[i-1][j] + chache[i][j-1];
            }
        }
        return chache[m-1][n-1];
    }
};
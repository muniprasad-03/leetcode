// Last updated: 04/04/2026, 23:36:59
class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int n=triangle.size();
        vector<vector<int>> dp(n,vector<int>(n,INT_MAX / 2));
        dp[0][0]=triangle[0][0];
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<=i;j++) {
                int curr=dp[i][j];
                // left
                dp[i+1][j]=min(dp[i+1][j],curr+triangle[i+1][j]);
                // right
                dp[i+1][j+1]=min(dp[i+1][j+1],curr+triangle[i+1][j+1]);
            }
        }
        int ans=INT_MAX;
        for(int v:dp[n-1]) ans=min(ans,v);
        return ans;
    }
};

// Last updated: 04/04/2026, 23:32:49
class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int m = matrix.size();;
        int n = matrix[0].size();;
        vector<vector<int>> ans(n,vector<int>(m));
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
};
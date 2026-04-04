// Last updated: 04/04/2026, 23:29:03
class Solution {
public:
    vector<vector<int>> sortMatrix(vector<vector<int>>& grid) {
        int n=grid.size();
        for (int i=0;i<n;i++) {
            int x=i,y=0;
            vector<int> diag;
            while (x<n && y<n) {
                diag.push_back(grid[x][y]);
                x++;
                y++;
            }
            sort(diag.begin(),diag.end(),greater<int>());
            x=i,y=0;
            int idx=0;
            while (x<n && y<n) {
                grid[x][y]=diag[idx++];
                x++;
                y++;
            }
        }
        for (int j=1;j<n;j++) {
            int x=0,y=j;
            vector<int> diag;
            while (x<n && y<n) {
                diag.push_back(grid[x][y]);
                x++;
                y++;
            }
            sort(diag.begin(),diag.end());
            x=0,y=j;
            int idx=0;
            while (x<n && y<n) {
                grid[x][y]=diag[idx++];
                x++;
                y++;
            }
        }
        return grid;
    }
};

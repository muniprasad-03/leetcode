// Last updated: 04/04/2026, 23:35:24
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        // start by top right or bottom left
        // compare either sides with target to delete row or column to reach it
        int row = matrix.size()-1;
        int col = 0;
        while(row >= 0 && col <= matrix[0].size()-1) {
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col] < target) col++;
            else row--;
        }
        return false;
    }
};
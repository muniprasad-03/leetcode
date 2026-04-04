// Last updated: 04/04/2026, 23:35:21
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start by top right or bottom left
        // compare either sides with target to delete row or column to reach it
        int row = matrix.length-1;
        int col = 0;
        while(row >= 0 && col <= matrix[0].length-1) {
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col] < target) col++;
            else row--;
        }
        return false;
    }
}
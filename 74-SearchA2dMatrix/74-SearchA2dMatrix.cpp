// Last updated: 04/04/2026, 23:37:49
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n = matrix.size();
        int m = matrix[0].size();
        int start = 0;
        int end = m*n-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            int rowIdx = mid/m;
            int colIdx = mid%m;
            if(matrix[rowIdx][colIdx]==target) return true;
            else if(matrix[rowIdx][colIdx] < target) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
};
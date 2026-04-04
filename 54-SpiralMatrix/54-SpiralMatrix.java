// Last updated: 04/04/2026, 23:38:12
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int stRow = 0;
        int endRow = matrix.length-1;
        int stCol = 0;
        int endCol = matrix[0].length-1;
        while(stRow<=endRow && stCol<=endCol) {
            //top
            for(int i=stCol;i<=endCol;i++) {
                ans.add(matrix[stRow][i]);
            }
            stRow++;
            //right
            for(int i=stRow;i<=endRow;i++) {
                ans.add(matrix[i][endCol]);
            }
            endCol--;
            // bottom
            if (stRow <= endRow) {
                for (int i = endCol; i >= stCol; i--) {
                    ans.add(matrix[endRow][i]);
                }
                endRow--;
            }
            // left
            if (stCol <= endCol) {
                for (int i = endRow; i >= stRow; i--) {
                    ans.add(matrix[i][stCol]);
                }
                stCol++;
            }
        }
        return ans;
    }
}
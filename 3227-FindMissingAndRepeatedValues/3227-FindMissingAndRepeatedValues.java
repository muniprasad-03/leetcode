// Last updated: 04/04/2026, 23:29:43
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int l=grid.length;
        int[] ans = new int[2];
        int totalSum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<l;i++) {
            for(int j=0;j<l;j++) {
                totalSum+=grid[i][j];
                if(set.contains(grid[i][j])) {
                    ans[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        int expectedSum = (l*l)*(l*l+1)/2;
        ans[1] = expectedSum - totalSum + ans[0];
        return ans;
    }
}
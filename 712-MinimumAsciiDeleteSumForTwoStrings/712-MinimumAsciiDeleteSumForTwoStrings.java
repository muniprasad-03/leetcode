// Last updated: 04/04/2026, 23:33:20
class Solution {
    private int[][] cache;
    private int m,n;
    String s1, s2;
    private int solve(int i, int j) {
        if(i>=m && j>=n) return 0;
        if(i>=m) {
            return s2.charAt(j) + solve(i, j+1);
        }
        if(j >= n) {
            return s1.charAt(i) + solve(i+1, j);
        }
        if(cache[i][j] != -1) {
            return cache[i][j];
        } 
        if(s1.charAt(i) != s2.charAt(j)) {
            int removeS1 = s1.charAt(i) + solve(i+1, j);
            int removeS2 = s2.charAt(j) + solve(i, j+1);
            cache[i][j] = Math.min(removeS1, removeS2);
        } else {
            cache[i][j] = solve(i+1, j+1);
        }
        return cache[i][j];
    }
    public int minimumDeleteSum(String s1, String s2) {
        this.m = s1.length();
        this.n = s2.length();
        this.s1 = s1;
        this.s2 = s2;
        this.cache = new int[m][n];
        for(int[] row : cache) {
            Arrays.fill(row, -1);
        }
        return solve(0, 0);
    }
}
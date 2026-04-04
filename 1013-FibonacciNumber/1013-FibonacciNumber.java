// Last updated: 04/04/2026, 23:32:26
class Solution {
    public int fib(int n) {
        int[] memo = new int[n + 1];
        return computeFib(n, memo);
    }
    public static int computeFib(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        return memo[n] = computeFib(n - 1, memo) + computeFib(n - 2, memo);
    }
}

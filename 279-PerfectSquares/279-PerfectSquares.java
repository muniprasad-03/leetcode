// Last updated: 04/04/2026, 23:35:14
class Solution {
    public int help(int num,int[] cache) {
        if(num==0) return 0;
        if(cache[num]!=-1) return cache[num];
        int ans = num;
        for(int i=1;i*i<=num;i++) {
            int square = i*i;
            ans = Math.min(ans,1+help(num-square,cache));
        }
        return cache[num]=ans;
    }
    public int numSquares(int n) {
        int[] cache = new int[n+1];
        Arrays.fill(cache,-1);
        return help(n,cache);
    }
}
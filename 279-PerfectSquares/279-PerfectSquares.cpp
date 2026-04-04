// Last updated: 04/04/2026, 23:35:11
class Solution {
public:
    int help(int num,vector<int>& cache) {
        if(num==0) return 0;
        if(cache[num]!=-1) return cache[num];
        int ans = num;
        for(int i=1;i*i<=num;i++) {
            int square = i*i;
            ans = min(ans,1+help(num-square,cache));
        }
        return cache[num]=ans;
    }
    int numSquares(int n) {
        vector<int> cache(n+1,-1);
        return help(n,cache);
    }
};
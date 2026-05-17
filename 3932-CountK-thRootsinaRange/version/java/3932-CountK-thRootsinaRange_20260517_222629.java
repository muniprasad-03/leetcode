// Last updated: 17/05/2026, 22:26:29
1class Solution {
2    private long power(long base, long k, long r) {
3        long ans = 1;
4        for(int i=0;i<k;i++) {
5            if(base!=0 && ans>r/base) {
6                return r + 1;
7            }
8            ans *= base;
9        }
10        return ans;
11    }
12    public int countKthRoots(int l, int r, int k) {
13        if(k == 1) {
14            return r-l+1;
15        }
16        int cnt = 0;
17        for(long x=0; ;x++) {
18            long y = power(x, k, r);
19            if(y>=l && y<=r) {
20                cnt++;
21            } else if(y > r) {
22                break;
23            }
24        }
25        return cnt;
26    }
27}
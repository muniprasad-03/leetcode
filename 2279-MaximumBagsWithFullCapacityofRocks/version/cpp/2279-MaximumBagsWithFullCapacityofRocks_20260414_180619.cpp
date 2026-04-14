// Last updated: 14/04/2026, 18:06:19
1class Solution {
2public:
3    int maximumBags(vector<int>& capacity, vector<int>& rocks, int additionalRocks) {
4        int n = capacity.size();
5        vector<int> diff(n);
6        for(int i=0;i<n;i++) {
7            diff[i] = capacity[i] - rocks[i];
8        }
9        sort(diff.begin(), diff.end());
10        int ans = 0;
11        for(int num : diff) {
12            if(additionalRocks - num >= 0) {
13                additionalRocks -= num;
14                ans++;
15            } else {
16                break;
17            }
18        }
19        return ans;
20    }
21};
// Last updated: 04/04/2026, 23:33:12
class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int c1 = 0; 
        int c2 = 0; 
        for (int i = 2; i <= cost.size(); ++i) {
            int curr = min(c1 + cost[i - 2], c2 + cost[i - 1]);
            c1 = c2;
            c2 = curr;
        }
        return c2;
    }
};

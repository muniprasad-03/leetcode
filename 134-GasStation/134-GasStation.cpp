// Last updated: 04/04/2026, 23:36:47
class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = gas.size();
        int totGas = 0;
        int totCost = 0;
        for(int i=0;i<n;i++) {
            totCost += cost[i];
            totGas += gas[i];
        }
        if(totGas < totCost) return -1;
        int currGas = 0;
        int ans = 0;
        for(int i=0;i<n;i++) {
            currGas += (gas[i] - cost[i]);
            if(currGas < 0) {
                currGas = 0;
                ans = i + 1;
            }
        }
        return ans;
    }
};
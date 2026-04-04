// Last updated: 04/04/2026, 23:36:51
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
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
}
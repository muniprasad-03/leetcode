// Last updated: 04/04/2026, 23:27:33
class Solution {
    public long countStableSubarrays(int[] capacity) {
        int n = capacity.length;
        if(n<3) return 0;
        long[] prefixSums = new long[n];
        prefixSums[0] = capacity[0];
        for(int i=1;i<n;i++) {
            prefixSums[i] = prefixSums[i-1] + capacity[i];
        }
        long ans = 0;
        Map<Long,Map<Long,Long>> counts = new HashMap<>();
        long v0 = (long)capacity[0];
        long t0 = prefixSums[0]+v0;
        counts.computeIfAbsent(v0,k->new HashMap<>()).put(t0,1L);
        for(int i=1;i<n-1;i++) {
            long vR = (long)capacity[i+1];
            long pR = prefixSums[i];
            if(counts.containsKey(vR)) {
                Map<Long,Long> inner = counts.get(vR);
                if(inner.containsKey(pR)) {
                    ans += inner.get(pR);
                }
            }
            long vL = (long)capacity[i];
            long tL = prefixSums[i] + vL;
            counts.computeIfAbsent(vL,k->new HashMap<>()).merge(tL,1L,Long::sum);
        }
        return ans;
    }
}
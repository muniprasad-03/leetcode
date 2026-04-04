// Last updated: 04/04/2026, 23:27:39
class Solution {
    public int countMajoritySubarrays(int[] nums,int target) {
        long count=0;
        Map<Integer,Integer> pSumCounts=new HashMap<>();
        pSumCounts.put(0,1);
        int currentSum=0;
        for (int n:nums) {
            currentSum+=(n==target) ? 1:-1;
            for (Map.Entry<Integer,Integer> entry:pSumCounts.entrySet()) {
                int prevSum=entry.getKey();
                int c=entry.getValue();
                if (currentSum>prevSum) {
                    count+=c;
                }
            }
            pSumCounts.put(currentSum,pSumCounts.getOrDefault(currentSum,0) + 1);
        }
        return (int) count;
    }
}
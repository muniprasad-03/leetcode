// Last updated: 04/04/2026, 23:27:07
class Solution {
    private int reverse(int x) {
        long reversed = 0;
        while(x>0) {
            reversed = reversed*10+(x%10);
            x/=10;
        }
        return (int)reversed;
    }
    public int minMirrorPairDistance(int[] nums) {
        int minDist = Integer.MAX_VALUE;
        Map<Integer,Integer> lastIdxRevVal = new HashMap<>();
        for(int j=0;j<nums.length;j++) {
            int curr = nums[j];
            if(lastIdxRevVal.containsKey(curr)) {
                int i=lastIdxRevVal.get(curr);
                int dist = j-i;
                minDist=Math.min(minDist,dist);
            }
            int revVal=reverse(curr);
            lastIdxRevVal.put(revVal,j);
        }
        return (minDist==Integer.MAX_VALUE)?-1:minDist;
    }
}
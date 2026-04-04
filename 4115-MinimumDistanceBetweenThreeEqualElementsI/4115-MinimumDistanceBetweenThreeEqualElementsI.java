// Last updated: 04/04/2026, 23:27:22
class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length,minDist=Integer.MAX_VALUE;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++) {
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for(List<Integer> idxs:map.values()) {
            if(idxs.size()<3) continue;
            for(int i=0;i<=idxs.size()-3;i++) {
                int a=idxs.get(i),c=idxs.get(i+2);
                minDist=Math.min(minDist,c-a);
            }
        }
        return(minDist==Integer.MAX_VALUE)?-1:2*minDist;
    }
}

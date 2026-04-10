// Last updated: 10/04/2026, 09:37:52
1class Solution {
2    public int minimumDistance(int[] nums) {
3        int n=nums.length,minDist=Integer.MAX_VALUE;
4        Map<Integer,List<Integer>> map=new HashMap<>();
5        for(int i=0;i<n;i++) {
6            map.putIfAbsent(nums[i],new ArrayList<>());
7            map.get(nums[i]).add(i);
8        }
9        for(List<Integer> idxs:map.values()) {
10            if(idxs.size()<3) continue;
11            for(int i=0; i+3 <= idxs.size(); i++) {
12                int a = idxs.get(i);
13                int b = idxs.get(i+1);
14                int c = idxs.get(i+2);
15                int diff = Math.abs(a-b) + Math.abs(b-c) + Math.abs(c-a);
16                minDist=Math.min(minDist, diff);
17            }
18        }
19        return(minDist==Integer.MAX_VALUE)?-1:minDist;
20    }
21}
22
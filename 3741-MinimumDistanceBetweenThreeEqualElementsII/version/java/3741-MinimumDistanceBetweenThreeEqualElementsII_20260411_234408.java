// Last updated: 11/04/2026, 23:44:08
1class Solution{
2    public int minimumDistance(int[] nums) {
3        int n=nums.length;
4        int min=Integer.MAX_VALUE;
5        Map<Integer,List<Integer>> m=new HashMap<>();
6        for(int i=0;i<n;i++){
7            m.putIfAbsent(nums[i],new ArrayList<>());
8            m.get(nums[i]).add(i);
9        }
10        for(List<Integer> l : m.values()) {
11            if(l.size() < 3) continue;
12            for(int x=0;x<=l.size()-3;x++) {
13                int a = l.get(x);
14                int b = l.get(x+1);
15                int c = l.get(x+2);
16                int diff = Math.abs(a-b) + Math.abs(b-c) + Math.abs(c-a);
17                min = Math.min(min, diff);
18            }
19        }
20        return (min==Integer.MAX_VALUE) ? -1 : min;
21    }
22}
23
// Last updated: 16/04/2026, 14:12:04
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        int n = nums.length;
4        List<Integer> ans = new ArrayList<>();
5        HashMap<Integer, List<Integer>> map = new HashMap<>();
6        for(int i=0;i<n;i++) {
7            map.putIfAbsent(nums[i], new ArrayList<>());
8            map.get(nums[i]).add(i);
9        }
10        System.out.println(map);
11        for(int i=0; i<queries.length;i++) {
12            int tar = nums[queries[i]];
13            List<Integer> list = map.get(tar);
14            if(list.size() == 1) {
15                ans.add(-1);
16                continue;
17            }
18            int m = list.size();
19            int pos = Collections.binarySearch(list, queries[i]);
20
21            int currIdx = list.get(pos);
22            int leftIdx = list.get((pos - 1 + m) % m);
23            int rightIdx = list.get((pos + 1) % m);
24
25            int forWard = Math.abs(currIdx - leftIdx);
26            int backWard = n - forWard;
27            int val = Math.min(forWard, backWard);
28
29            forWard = Math.abs(currIdx - rightIdx);
30            backWard = n - forWard;
31            val = Math.min(val, Math.min(forWard, backWard));
32            ans.add(val);
33        }
34        return ans;
35    }
36}
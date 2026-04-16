// Last updated: 16/04/2026, 14:14:50
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        int n = nums.length;
4        List<Integer> ans = new ArrayList<>();
5        HashMap<Integer, List<Integer>> map = new HashMap<>();
6        for(int i=0;i<n;i++) {
7            map.putIfAbsent(nums[i], new ArrayList<>());
8            map.get(nums[i]).add(i);
9        }
10        for(int i=0; i<queries.length;i++) {
11            int tar = nums[queries[i]];
12            List<Integer> list = map.get(tar);
13            if(list.size() == 1) {
14                ans.add(-1);
15                continue;
16            }
17            int m = list.size();
18            int pos = Collections.binarySearch(list, queries[i]);
19
20            int currIdx = list.get(pos);
21            int leftIdx = list.get((pos - 1 + m) % m);
22            int rightIdx = list.get((pos + 1) % m);
23
24            int forWard = Math.abs(currIdx - leftIdx);
25            int backWard = n - forWard;
26            int val = Math.min(forWard, backWard);
27
28            forWard = Math.abs(currIdx - rightIdx);
29            backWard = n - forWard;
30            val = Math.min(val, Math.min(forWard, backWard));
31            ans.add(val);
32        }
33        return ans;
34    }
35}
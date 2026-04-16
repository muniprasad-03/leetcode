// Last updated: 16/04/2026, 14:16:52
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        int n = nums.length;
4        List<Integer> ans = new ArrayList<>();
5        HashMap<Integer, List<Integer>> map = new HashMap<>();
6
7        for(int i = 0; i < n; i++) {
8            map.putIfAbsent(nums[i], new ArrayList<>());
9            map.get(nums[i]).add(i);
10        }
11
12        int[] res = new int[n];
13        Arrays.fill(res, -1);
14
15        for(List<Integer> list : map.values()) {
16            int m = list.size();
17            if(m == 1) continue;
18
19            for(int i = 0; i < m; i++) {
20                int currIdx = list.get(i);
21                int leftIdx = list.get((i - 1 + m) % m);
22                int rightIdx = list.get((i + 1) % m);
23
24                int forWard = Math.abs(currIdx - leftIdx);
25                int backWard = n - forWard;
26                int val = Math.min(forWard, backWard);
27
28                forWard = Math.abs(currIdx - rightIdx);
29                backWard = n - forWard;
30                val = Math.min(val, Math.min(forWard, backWard));
31
32                res[currIdx] = val;
33            }
34        }
35
36        for(int q : queries) {
37            ans.add(res[q]);
38        }
39
40        return ans;
41    }
42}
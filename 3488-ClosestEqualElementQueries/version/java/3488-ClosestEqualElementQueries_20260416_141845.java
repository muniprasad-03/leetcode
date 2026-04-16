// Last updated: 16/04/2026, 14:18:45
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        int n = nums.length;
4        Map<Integer, List<Integer>> map = new HashMap<>();
5        for (int i = 0; i < n; i++) {
6            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
7        }
8
9        int[] res = new int[n];
10        Arrays.fill(res, -1);
11        for (List<Integer> list : map.values()) {
12            int m = list.size();
13            if (m == 1) continue;
14            for (int i = 0; i < m; i++) {
15                int currIdx = list.get(i);
16
17                int leftIdx = list.get((i - 1 + m) % m);
18                int rightIdx = list.get((i + 1) % m);
19
20                int d1 = Math.abs(currIdx - leftIdx);
21                int d2 = Math.abs(currIdx - rightIdx);
22
23                int val = Math.min(Math.min(d1, n - d1), Math.min(d2, n - d2));
24
25                res[currIdx] = val;
26            }
27        }
28        List<Integer> ans = new ArrayList<>();
29        for (int q : queries) {
30            ans.add(res[q]);
31        }
32
33        return ans;
34    }
35}
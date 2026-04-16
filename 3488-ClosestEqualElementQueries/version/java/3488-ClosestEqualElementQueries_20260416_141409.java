// Last updated: 16/04/2026, 14:14:09
1class Solution {
2    public int binarySearch(List<Integer> list, int target) {
3        int low = 0, high = list.size() - 1;
4        while (low <= high) {
5            int mid = low + (high - low) / 2;
6            if (list.get(mid) == target) {
7                return mid;
8            } else if (list.get(mid) < target) {
9                low = mid + 1;
10            } else {
11                high = mid - 1;
12            }
13        }
14        return -1;
15    }
16    public List<Integer> solveQueries(int[] nums, int[] queries) {
17        int n = nums.length;
18        List<Integer> ans = new ArrayList<>();
19        HashMap<Integer, List<Integer>> map = new HashMap<>();
20        for(int i=0;i<n;i++) {
21            map.putIfAbsent(nums[i], new ArrayList<>());
22            map.get(nums[i]).add(i);
23        }
24        for(int i=0; i<queries.length;i++) {
25            int tar = nums[queries[i]];
26            List<Integer> list = map.get(tar);
27            if(list.size() == 1) {
28                ans.add(-1);
29                continue;
30            }
31            int m = list.size();
32            int pos = binarySearch(list, queries[i]);
33
34            int currIdx = list.get(pos);
35            int leftIdx = list.get((pos - 1 + m) % m);
36            int rightIdx = list.get((pos + 1) % m);
37
38            int forWard = Math.abs(currIdx - leftIdx);
39            int backWard = n - forWard;
40            int val = Math.min(forWard, backWard);
41
42            forWard = Math.abs(currIdx - rightIdx);
43            backWard = n - forWard;
44            val = Math.min(val, Math.min(forWard, backWard));
45            ans.add(val);
46        }
47        return ans;
48    }
49}
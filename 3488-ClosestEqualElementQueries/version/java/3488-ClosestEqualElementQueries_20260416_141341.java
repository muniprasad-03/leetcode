// Last updated: 16/04/2026, 14:13:41
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
24        System.out.println(map);
25        for(int i=0; i<queries.length;i++) {
26            int tar = nums[queries[i]];
27            List<Integer> list = map.get(tar);
28            if(list.size() == 1) {
29                ans.add(-1);
30                continue;
31            }
32            int m = list.size();
33            int pos = binarySearch(list, queries[i]);
34
35            int currIdx = list.get(pos);
36            int leftIdx = list.get((pos - 1 + m) % m);
37            int rightIdx = list.get((pos + 1) % m);
38
39            int forWard = Math.abs(currIdx - leftIdx);
40            int backWard = n - forWard;
41            int val = Math.min(forWard, backWard);
42
43            forWard = Math.abs(currIdx - rightIdx);
44            backWard = n - forWard;
45            val = Math.min(val, Math.min(forWard, backWard));
46            ans.add(val);
47        }
48        return ans;
49    }
50}
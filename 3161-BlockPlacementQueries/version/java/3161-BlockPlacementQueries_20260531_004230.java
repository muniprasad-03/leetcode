// Last updated: 31/05/2026, 00:42:30
1class SegmentTree {
2    int n;
3    int[] segArray;
4    SegmentTree(int n) {
5        this.n = n;
6        this.segArray = new int[4 * n];
7    }
8    void update(int idx, int val) {
9        update(0, 0, n - 1, idx, val);
10    }
11    void update(int node, int start, int end, int idx, int val) {
12        if(start == end) {
13            segArray[node] = val;
14            return;
15        }
16        int mid = start + (end - start) / 2;
17        if(idx <= mid) {
18            update(2*node + 1, start, mid, idx, val);
19        } else {
20            update(2*node + 2, mid + 1, end, idx, val);
21        }
22        segArray[node] = Math.max(segArray[2 * node + 1], segArray[2 * node + 2]);
23    }
24    int query(int start, int end) {
25        return query(0, 0, n - 1, start, end);
26    }
27    int query(int node, int start, int end, int left, int right) {
28        if(left > end || right < start) return 0;
29        if(left <= start && end <= right) return segArray[node];
30        int mid = start + (end - start) / 2;
31        return Math.max(
32            query(2 * node + 1, start, mid, left, right),
33            query(2 * node + 2, mid + 1, end, left, right)
34        );
35    }
36}
37
38class Solution {
39    public List<Boolean> getResults(int[][] queries) {
40        int maxLim = 50001;
41        SegmentTree segTree = new SegmentTree(maxLim);
42        TreeSet<Integer> obstacles = new TreeSet<>();
43        obstacles.add(0);
44        List<Boolean> ans = new ArrayList<>();
45        for(int[] qry : queries) {
46            int type = qry[0];
47            if(type == 1) {
48                int x = qry[1];
49                Integer prev = obstacles.floor(x);
50                Integer next = obstacles.ceiling(x);
51                obstacles.add(x);
52                segTree.update(x, x - prev);
53                if(next != null) {
54                    segTree.update(next, next - x);
55                }
56            } else {
57                int x = qry[1];
58                int sz = qry[2];
59                int maxGap = segTree.query(0, x);
60                int lastObs = obstacles.floor(x);
61                maxGap = Math.max(maxGap, x - lastObs);
62                ans.add(maxGap >= sz);
63            }
64        }
65        return ans;
66    }
67}
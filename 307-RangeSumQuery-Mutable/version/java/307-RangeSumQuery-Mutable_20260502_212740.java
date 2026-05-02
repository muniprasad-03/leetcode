// Last updated: 02/05/2026, 21:27:40
1class NumArray {
2    public int[] segmentTree;
3    private int[] nums;
4    private int n;
5    public NumArray(int[] nums) {
6        this.n = nums.length;
7        this.nums = nums;
8        this.segmentTree = new int[4*n];
9        buildSegTree(0, 0, n-1);
10    }
11
12    private int buildSegTree(int node, int start, int end) {
13        if(start == end) {
14            segmentTree[node] = nums[start];
15            return segmentTree[node];
16        }
17        int mid = (start+end)/2;
18        int leftSum = buildSegTree(2*node+1, start, mid);
19        int rightSum = buildSegTree(2*node+2, mid+1, end);
20        segmentTree[node] = leftSum+rightSum;
21        return segmentTree[node];
22    }
23
24    private void updateSegTree(int node, int start, int end, int index, int val) {
25        if(start == end) {
26            segmentTree[node] = val;
27            return;
28        }
29        int mid = (start+end)/2;
30        if(index <= mid) {
31            updateSegTree(2*node+1, start, mid, index, val);
32        } else {
33            updateSegTree(2*node+2, mid+1, end, index, val);
34        }
35        segmentTree[node] = segmentTree[2*node+1] + segmentTree[2*node+2];
36    }
37
38    public void update(int index, int val) {
39        updateSegTree(0, 0, nums.length-1, index, val);
40    }
41
42    private int query(int node, int start, int end, int left, int right) {
43        if(right < start || end < left) {
44            return 0;
45        }
46        if(left <= start && end <= right) {
47            return segmentTree[node];
48        }
49        int mid = (start+end)/2;
50        int leftSum = query(2*node+1, start, mid, left, right);
51        int rightSum = query(2*node+2, mid+1, end, left, right);
52        return leftSum + rightSum;
53    }
54    
55    public int sumRange(int left, int right) {
56        return query(0, 0, nums.length-1, left, right);
57    }
58}
59
60/**
61*Your NumArray object will be instantiated and called as such:
62*NumArray obj = new NumArray(nums);
63*obj.update(index,val);
64*int param_2 = obj.sumRange(left,right);
65 */
// Last updated: 09/05/2026, 00:51:36
1class Solution {
2    private boolean[] buildSieve(int max) {
3        boolean[] sieve = new boolean[max+1];
4        if(max < 2) return sieve;
5        Arrays.fill(sieve, true);
6        sieve[0] = sieve[1] = false;
7        for(int i = 2;i*i<=max;i++) {
8            if(sieve[i]) {
9                for(int j=i*i;j<=max;j+=i) sieve[j] = false;
10            }
11        }
12        return sieve;
13    }
14    public int minJumps(int[] nums) {
15        int n = nums.length;
16        if(n<=1) return 0;
17        int maxVal = 0;
18        for(int x : nums) maxVal = Math.max(maxVal, x);
19        boolean[] isPrime = buildSieve(maxVal);
20        Map<Integer, List<Integer>> map = new HashMap<>();
21        for(int i = 0;i < n;i++) {
22            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
23        }
24        Queue<Integer> queue = new LinkedList<>();
25        boolean[] vis = new boolean[n];
26        queue.offer(0);
27        vis[0] = true;
28        int steps = 0;
29        while(!queue.isEmpty()) {
30            int size = queue.size();
31            while(size-- > 0) {
32                int currIdx = queue.poll();
33                if(currIdx == n-1) return steps;
34                int p = nums[currIdx];
35                if(currIdx+1 < n && !vis[currIdx+1]) {
36                    vis[currIdx+1] = true;
37                    queue.offer(currIdx+1);
38                }
39                if(currIdx-1 >= 0 && !vis[currIdx-1]) {
40                    vis[currIdx-1] = true;
41                    queue.offer(currIdx-1);
42                }
43                if(p > 1 && isPrime[p]) {
44                    for(int m = p; m<=maxVal; m+=p) {
45                        if(map.containsKey(m)) {
46                            List<Integer> indices = map.get(m);
47                            for(int idx : indices) {
48                                if(!vis[idx]) {
49                                    vis[idx] = true;
50                                    queue.offer(idx);
51                                }
52                            }
53                            map.remove(m);
54                        }
55                    }
56                }
57            }
58            steps++;
59        }
60        return -1;
61    }
62}
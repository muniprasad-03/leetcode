// Last updated: 08/05/2026, 22:21:17
1class Solution {
2    public int minJumps(int[] nums) {
3        int n = nums.length;
4        if(n<=1) return 0;
5        int maxVal = 0;
6        for(int x : nums) maxVal = Math.max(maxVal, x);
7        boolean[] isPrime = buildSieve(maxVal);
8        Map<Integer, List<Integer>> map = new HashMap<>();
9        for(int i = 0;i < n;i++) {
10            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
11        }
12        Queue<Integer> queue = new LinkedList<>();
13        boolean[] vis = new boolean[n];
14        queue.offer(0);
15        vis[0] = true;
16        int steps = 0;
17        while(!queue.isEmpty()) {
18            int size = queue.size();
19            while(size-- > 0) {
20                int currIdx = queue.poll();
21                if(currIdx == n-1) return steps;
22                int p = nums[currIdx];
23                if(currIdx+1 < n && !vis[currIdx+1]) {
24                    vis[currIdx+1] = true;
25                    queue.offer(currIdx+1);
26                }
27                if(currIdx-1 >= 0 && !vis[currIdx-1]) {
28                    vis[currIdx-1] = true;
29                    queue.offer(currIdx-1);
30                }
31                if(p > 1 && isPrime[p]) {
32                    for(int m = p; m<=maxVal; m+=p) {
33                        if(map.containsKey(m)) {
34                            List<Integer> indices = map.get(m);
35                            for(int idx : indices) {
36                                if(!vis[idx]) {
37                                    vis[idx] = true;
38                                    queue.offer(idx);
39                                }
40                            }
41                            map.remove(m);
42                        }
43                    }
44                }
45            }
46            steps++;
47        }
48        return -1;
49    }
50    private boolean[] buildSieve(int max) {
51        boolean[] sieve = new boolean[max+1];
52        if(max < 2) return sieve;
53        Arrays.fill(sieve, true);
54        sieve[0] = sieve[1] = false;
55        for(int i = 2;i*i<=max;i++) {
56            if(sieve[i]) {
57                for(int j=i*i;j<=max;j+=i) sieve[j] = false;
58            }
59        }
60        return sieve;
61    }
62}
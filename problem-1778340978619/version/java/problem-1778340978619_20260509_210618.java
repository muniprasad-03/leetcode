// Last updated: 09/05/2026, 21:06:18
1class Solution {
2    private String key(int[] p) {
3        return p[0]+","+p[1]+","+p[2];
4    }
5    private int[] mid(int[] a, int[] b) {
6        return new int[]{
7           (a[0]+b[0])/2,
8           (a[1]+b[1])/2,
9           (a[2]+b[2])/2
10        };
11    }
12    private boolean same(int[] a, int[] b) {
13        return a[0] == b[0] &&
14               a[1] == b[1] &&
15               a[2] == b[2];
16    }
17    public int minGenerations(int[][] points, int[] target) {
18        List<int[]> queue = new ArrayList<>();
19        Set<String> vis = new HashSet<>();
20        for(int[] p : points) {
21            if(same(p, target)) return 0;
22
23            queue.add(p);
24            vis.add(key(p));
25        }
26        int gen = 0;
27        while(true) {
28            List<int[]> next = new ArrayList<>();
29            int size = queue.size();
30            for(int i = 0;i<size;i++) {
31                for(int j = i+1;j<size;j++) {
32                    if(same(queue.get(i), queue.get(j))) continue;
33                    int[] c = mid(queue.get(i), queue.get(j));
34                    String k = key(c);
35                    if(!vis.contains(k)) {
36                        if(same(c, target))
37                            return gen+1;
38                        vis.add(k);
39                        next.add(c);
40                    }
41                }
42            }
43            if(next.isEmpty()) return -1;
44            queue.addAll(next);
45            gen++;
46        }
47    }
48}
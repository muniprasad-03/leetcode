// Last updated: 05/04/2026, 08:20:05
1class Solution {
2    public List<Integer> findGoodIntegers(int n) {
3        Map<Integer, Integer> map = new HashMap<>();
4        int lim = (int) Math.cbrt(n);
5        for (int a = 1;a <= lim;a++) {
6            long a3 = (long) a*a*a;
7            for (int b = a;b <= lim;b++) {
8                long b3 = (long) b*b*b;
9                long sum = a3 + b3;
10                if (sum <= n) {
11                    int s = (int) sum;
12                    map.put(s, map.getOrDefault(s, 0) + 1);
13                } else {
14                    break;
15                }
16            }
17        }
18        List<Integer> result = new ArrayList<>();
19        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
20            if (entry.getValue() >= 2) {
21                result.add(entry.getKey());
22            }
23        }
24        Collections.sort(result);
25        return result;
26    }
27}
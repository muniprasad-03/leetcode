// Last updated: 31/05/2026, 08:02:37
1class Solution {
2    public int digitFrequencyScore(int n) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        while(n > 0) {
5            int d = n % 10;
6            map.put(d, map.getOrDefault(d, 0) + 1);
7            n /= 10;
8        }
9        int score = 0;
10        for(int key : map.keySet()) {
11            score += (key * map.get(key));
12        }
13        return score;
14    }
15}
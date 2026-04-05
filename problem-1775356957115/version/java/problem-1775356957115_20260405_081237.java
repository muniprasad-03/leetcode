// Last updated: 05/04/2026, 08:12:37
1class Solution {
2    public int mirrorFrequency(String s) {
3        Map<Character, Integer> freq = new HashMap<>();
4        for(char c : s.toCharArray()) {
5            freq.put(c, freq.getOrDefault(c, 0) + 1);
6        }
7        int totalSum = 0;
8        Set<Character> vis = new HashSet<>();
9        for(char c : freq.keySet()) {
10            if(vis.contains(c)) continue;
11            char m = getMirror(c);
12            int freqC = freq.get(c);
13            int freqM = freq.getOrDefault(m, 0);
14            totalSum += Math.abs(freqC-freqM);
15            vis.add(c);
16            vis.add(m);
17        }
18        return totalSum;
19    }
20    private char getMirror(char c) {
21        if(Character.isDigit(c)) {
22            return (char)('9'-(c-'0'));
23        } else {
24            return (char)('z'-(c-'a'));
25        }
26    }
27}
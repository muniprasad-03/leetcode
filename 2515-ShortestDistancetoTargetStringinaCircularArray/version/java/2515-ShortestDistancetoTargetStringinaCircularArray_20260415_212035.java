// Last updated: 15/04/2026, 21:20:35
1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int n = words.length;
4        int i = startIndex;
5        boolean found = false;
6        int len1 = 0;
7        do {
8            if(words[i].equals(target)) {
9                found = true;
10                break;
11            }
12            len1++;
13            i = (i == n-1) ? 0 : i+1;
14        } while(i != startIndex);
15        if(found == false) return -1;
16        i = startIndex;
17        int len2 = 0;
18        do {
19            if(words[i].equals(target)) {
20                break;
21            }
22            len2++;
23            i = (i == 0) ? n-1 : i-1;
24        } while(i != startIndex);
25        return Math.min(len1, len2);
26    }
27}
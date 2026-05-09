// Last updated: 09/05/2026, 20:05:16
1class Solution {
2    public int[] scoreValidator(String[] events) {
3        int score = 0;
4        int counter = 0;
5        for(String e : events) {
6            if(e.length() == 1) {
7                char ch = e.charAt(0);
8                if(ch >= '0' && ch <= '6') {
9                    score += (ch - '0');
10                } else if(ch == 'W') {
11                    counter++;
12                    if(counter == 10) break;
13                }
14            } else {
15                score++;
16            }
17        }
18        return new int[]{score, counter};
19    }
20}
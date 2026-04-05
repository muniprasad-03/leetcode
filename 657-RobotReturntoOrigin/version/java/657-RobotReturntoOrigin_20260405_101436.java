// Last updated: 05/04/2026, 10:14:36
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int upDown = 0;
4        int leftRight = 0;
5        for(char ch : moves.toCharArray()) {
6            if(ch == 'U') upDown++;
7            else if(ch == 'D') upDown--;
8            else if(ch == 'L') leftRight++;
9            else leftRight--;
10        }
11        return upDown == 0 && leftRight == 0;
12    }
13}
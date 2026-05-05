// Last updated: 05/05/2026, 22:36:08
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder ans =  new StringBuilder();
4        int i = s.length()-1;
5        while(i >= 0) {
6            int count = 0;
7            while(count < k && i >= 0) {
8                if(s.charAt(i) != '-') {
9                    count++;
10                    ans.append(Character.toUpperCase(s.charAt(i)));
11                }
12                i--;
13            }
14            if(count > 0) {
15                int tempI = i;
16                while(tempI >= 0 && s.charAt(tempI) == '-') {
17                    tempI--;
18                }
19                if(tempI >= 0) {
20                    ans.append('-');
21                } 
22            }
23        }
24        return ans.reverse().toString();
25    }
26}
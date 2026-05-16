// Last updated: 16/05/2026, 18:51:45
1class Solution {
2    public List<String> printVertically(String s) {
3        String[] words = s.split(" ");
4        int m = 0;
5        int n = words.length;
6        for(String w : words) {
7            m = Math.max(m, w.length());
8        }
9        char[][] grid = new char[m][n];
10        for(int j=0;j<n;j++) {
11            String w = words[j];
12            for(int i = 0;i<m;i++) {
13                grid[i][j] = i<w.length() ? w.charAt(i) : ' ';
14            }
15        }
16        List<String> ans = new ArrayList<>();
17        for(int i=0;i<m;i++) {
18            int end = n-1;
19            while(end >= 0 && grid[i][end] == ' ') {
20                end--;
21            }
22            ans.add(new String(grid[i], 0, end+1));
23        }
24        return ans;
25    }
26}
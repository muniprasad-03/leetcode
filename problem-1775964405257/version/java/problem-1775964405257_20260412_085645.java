// Last updated: 12/04/2026, 08:56:45
1class Solution{
2    public int longestBalanced(String s) {
3        int n = s.length();
4        int total0 = 0;
5        for(int i = 0;i<n;i++) {
6            if(s.charAt(i) =='0')total0++;
7        }
8        int total1 = n-total0;
9        int[]pref = new int[n+1];
10        for(int i = 1;i<= n;i++) {
11            pref[i] = pref[i-1]+(s.charAt(i-1) =='0'?1:-1);
12        }
13        Map<Integer,List<Integer>>[] byParity = new HashMap[2];
14        byParity[0] = new HashMap<>();
15        byParity[1] = new HashMap<>();
16        for(int i = 0;i<= n;i++) {
17            int p = i&1;
18            byParity[p].computeIfAbsent(pref[i],k->new ArrayList<>()).add(i);
19        }
20        int ans = 0;
21        for(int r = 0;r<= n;r++) {
22            int p = r&1;
23            int sum = pref[r];
24            ans = Math.max(ans,best(r,byParity[p].get(sum),n));
25            ans = Math.max(ans,best(r,byParity[p].get(sum-2),2*total1));
26            ans = Math.max(ans,best(r,byParity[p].get(sum+2),2*total0));
27        }
28        return ans;
29    }
30    private int best(int r,List<Integer>list,int cap) {
31        if(list ==null)return 0;
32        int low = r-cap;
33        if(low<0)low = 0;
34        int idx = lb(list,low);
35        if(idx ==list.size()) return 0;
36        int l = list.get(idx);
37        if(l>r)return 0;
38        return r-l;
39    }
40    private int lb(List<Integer>list,int t) {
41        int l = 0,h = list.size();
42        while(l<h) {
43            int m = (l+h)>>>1;
44            if(list.get(m)<t)l = m+1;
45            else h = m;
46        }
47        return l;
48    }
49}
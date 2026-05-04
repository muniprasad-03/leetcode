// Last updated: 04/05/2026, 23:31:05
class Solution{
    public int longestBalanced(String s) {
        int n = s.length();
        int total0 = 0;
        for(int i = 0;i<n;i++) {
            if(s.charAt(i) =='0')total0++;
        }
        int total1 = n-total0;
        int[]pref = new int[n+1];
        for(int i = 1;i<= n;i++) {
            pref[i] = pref[i-1]+(s.charAt(i-1) =='0'?1:-1);
        }
        Map<Integer,List<Integer>>[] byParity = new HashMap[2];
        byParity[0] = new HashMap<>();
        byParity[1] = new HashMap<>();
        for(int i = 0;i<= n;i++) {
            int p = i&1;
            byParity[p].computeIfAbsent(pref[i],k->new ArrayList<>()).add(i);
        }
        int ans = 0;
        for(int r = 0;r<= n;r++) {
            int p = r&1;
            int sum = pref[r];
            ans = Math.max(ans,best(r,byParity[p].get(sum),n));
            ans = Math.max(ans,best(r,byParity[p].get(sum-2),2*total1));
            ans = Math.max(ans,best(r,byParity[p].get(sum+2),2*total0));
        }
        return ans;
    }
    private int best(int r,List<Integer>list,int cap) {
        if(list ==null)return 0;
        int low = r-cap;
        if(low<0)low = 0;
        int idx = lb(list,low);
        if(idx ==list.size()) return 0;
        int l = list.get(idx);
        if(l>r)return 0;
        return r-l;
    }
    private int lb(List<Integer>list,int t) {
        int l = 0,h = list.size();
        while(l<h) {
            int m = (l+h)>>>1;
            if(list.get(m)<t)l = m+1;
            else h = m;
        }
        return l;
    }
}
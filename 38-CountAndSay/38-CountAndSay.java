// Last updated: 04/04/2026, 23:38:29
class Solution {
    private StringBuilder help(StringBuilder str) {
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        int i =0;
        while(i<n) {
            char ch = str.charAt(i);
            int j = i;
            int count = 0;
            while(j<n && str.charAt(j) == ch) {
                count++;
                j++;
            }
            ans.append(count);
            ans.append(ch);
            i = j;
        }
        return ans;
    }
    public String countAndSay(int n) {
        StringBuilder ans = new StringBuilder("1");
        for(int i=1;i<n;i++) {
            ans = help(ans);
        }
        return ans.toString();
    }
}
// Last updated: 04/04/2026, 23:31:33
class Solution {
    private int idx = 0;
    public String ans = "";
    private void help(int size, StringBuilder str, int k) {
        if(!ans.isEmpty()) return;
        if(str.length() == size) {
            if(++idx == k)
                ans = str.toString();
            return;
        }
        for(char ch : new char[]{'a', 'b', 'c'}) {
            if(str.length() == 0 || str.charAt(str.length()-1) != ch) {
                str.append(ch);
                help(size, str, k);
                str.deleteCharAt(str.length()-1);
            }
        }
        return;
    }
    public String getHappyString(int n, int k) {
        int total = 3 * (int)Math.pow(2, n-1);
        help(n, new StringBuilder(), k);
        if(k > total) return ans;
        return ans;
    }
}
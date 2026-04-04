// Last updated: 04/04/2026, 23:33:50
class Solution {
    public void reverse(StringBuilder s,int start,int end) {
        while(start < end) {
            char temp = s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,temp);
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        int l = str.length();
        for(int i=0;i<l;) {
            reverse(str,i,Math.min(i + k - 1, l - 1));
            i += (2*k);
        }
        return str.toString();
    }
}
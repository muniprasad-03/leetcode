// Last updated: 04/04/2026, 23:34:35
class Solution {
    private String s;
    private int idx;
    private int n;
    public String help() {
        StringBuilder ans = new StringBuilder();
        while(idx<n && s.charAt(idx) != ']') {
            char ch = s.charAt(idx);
            if(Character.isDigit(ch)) {
                int num = 0;
                while(idx<n && Character.isDigit(s.charAt(idx))) {
                    num = num*10+(s.charAt(idx++)-'0');
                }
                idx++;
                String inner = help();
                idx++;
                while(num-- > 0) {
                    ans.append(inner);
                }
            } else {
                ans.append(ch);
                idx++;
            }
        }
        return ans.toString();
    }
    public String decodeString(String s) {
        this.s = s;
        this.n = s.length();
        this.idx = 0;
        return help();
    }
}
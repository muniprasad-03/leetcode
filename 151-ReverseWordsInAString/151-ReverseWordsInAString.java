// Last updated: 04/04/2026, 23:36:27
class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int i=0;
        while(i<n) {
            while(i<n && s.charAt(i)==' ') i++;
            if(i<n) st.push(i++);
            while(i<n && s.charAt(i)!=' ') i++;
        }
        while(!st.isEmpty()) {
            int idx = st.pop();
            while(idx<n && s.charAt(idx) != ' ') {
                ans.append(s.charAt(idx++));
            }
            if(!st.isEmpty()) ans.append(' ');
        }
        return ans.toString();
    }
}
// Last updated: 04/04/2026, 23:35:36
class Solution {
    public int calculate(String s) {
        if(s.length() == 0) return 0;
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        int i=0, num=0;
        char op= '+';
        while(i<n) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                num = 0;
                while(i<n && Character.isDigit(s.charAt(i))) {
                    num = num*10+(s.charAt(i)-'0');
                    i++;
                }
                if(op == '+') {
                    st.push(num);
                } else if(op == '-') {
                    st.push(-num);
                } else if(op == '*') {
                    st.push(st.pop()*num);
                } else if(op == '/') {
                    st.push(st.pop()/num);
                }
                continue;
            }
            if(ch != ' ') op = ch;
            i++;
        }
        int ans = 0;
        while(!st.isEmpty()) ans += st.pop();
        return ans;
    }
}
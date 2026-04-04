// Last updated: 04/04/2026, 23:29:58
class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(st.isEmpty()) {
                st.push(ch);
                continue;
            }
            char top = st.peek();
            if((ch=='B' && top == 'A') || (ch=='D' && top == 'C')) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        return st.size();
    }
}
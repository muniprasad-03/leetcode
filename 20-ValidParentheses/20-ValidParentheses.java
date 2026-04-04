// Last updated: 04/04/2026, 23:38:49
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pair = Map.of(
            ')','(',']','[','}','{'
        );
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(st.isEmpty() || pair.containsValue(ch)) {
                st.push(ch);
            } else if(!st.isEmpty() && st.peek() == pair.get(ch)) {
                st.pop();
            } else {
                return false;
            }
        }
        return st.size()==0;
    }
}
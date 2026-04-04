// Last updated: 04/04/2026, 23:33:14
class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int i = n-1;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        while(i>=0) {
            if(st.isEmpty()) {
                ans[i] = 0;
            } else if(!st.isEmpty() && temps[i]<temps[st.peek()]) {
                ans[i] = 1;
            } else {
                while(!st.isEmpty() && temps[i]>=temps[st.peek()]) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    ans[i] = 0;
                } else {
                    ans[i] = st.peek()-i;
                }
            }
            st.push(i);
            i--;
        }
        return ans;
    }
}
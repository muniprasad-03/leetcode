// Last updated: 04/04/2026, 23:33:15
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast : asteroids) {
            boolean isAlive = true;
            while(isAlive && ast<0 && !st.isEmpty() && st.peek()>0) {
                if(st.peek() < -ast) {
                    st.pop();
                } else if(st.peek() == -ast) {
                    st.pop();
                    isAlive = false;
                } else {
                    isAlive = false;
                }
            }
            if(isAlive) {
                st.push(ast);
            }
        }
        int x = st.size();
        int[] ans = new int[x];
        for(int i=x-1;i>=0;i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
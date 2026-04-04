// Last updated: 04/04/2026, 23:37:35
class Solution {
    private int[] heights;
    private int n;
    private int[] computePSE() {
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
    private int[] computeNSE() {
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }
    public int largestRectangleArea(int[] heights) {
        this.heights = heights;
        this.n = heights.length;
        int[] pse = computePSE();
        int[] nse = computeNSE();
        int ans = 0;
        for(int i=0;i<n;i++) {
            int w = nse[i]-pse[i]-1;
            ans = Math.max(ans, heights[i]*w);
        }
        return ans;
    }
}
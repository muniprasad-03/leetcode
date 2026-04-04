// Last updated: 04/04/2026, 23:28:18
class Solution {
    public long bowlSubarrays(int[] nums) {
        int len = nums.length;
        int[] nge = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i=len-1;i>=0;i--) {
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        int[] pge = new int[len];
        st.clear();
        for(int i=0;i<len;i++) {
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1: st.peek();
            st.push(i);
        }
        long cnt = 0;
        for(int i=0;i<len;i++) {
            if((nge[i]!=-1) &&(nge[i]>i+1)) {
                cnt++;
            }
            if((pge[i]!=-1) && (i>pge[i]+1)) {
                cnt++;
            }
        }
        return cnt;
    }
}
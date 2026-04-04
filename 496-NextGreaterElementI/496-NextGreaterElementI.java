// Last updated: 04/04/2026, 23:34:07
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--) {
            while((!st.isEmpty()) && nums2[i] >= st.peek()) {
                st.pop();
            }
            if(st.isEmpty()) {
                m.put(nums2[i],-1);
            } else {
                m.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int l = nums1.length;
        int[] ans = new int[l];
        for(int i=0;i<l;i++) {
            ans[i]=m.get(nums1[i]);
        }
        return ans;
    }
}
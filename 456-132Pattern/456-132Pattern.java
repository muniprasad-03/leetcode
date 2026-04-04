// Last updated: 04/04/2026, 23:34:11
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int secHighestNum = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i] < secHighestNum) {
                return true;
            }
            while(!st.isEmpty() && nums[i] > st.peek()) {
                secHighestNum = st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
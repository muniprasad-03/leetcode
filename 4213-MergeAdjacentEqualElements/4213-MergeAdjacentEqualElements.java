// Last updated: 04/04/2026, 23:26:27
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();
        for (int num : nums) {
            long current = (long)num;
            while (!st.isEmpty() && st.peek()==current) {
                current+=st.pop();
            }
            st.push(current);
        }
        return new ArrayList<>(st);
    }
}
// Last updated: 04/04/2026, 23:33:36
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        int prevTime = 0;
        for(String log : logs) {
            String[] curr = log.split(":");
            int id = Integer.parseInt(curr[0]);
            String state = curr[1];
            int timeStamp = Integer.parseInt(curr[2]);
            if(state.equals("start")) {
                if(!st.isEmpty()) ans[st.peek()] += (timeStamp-prevTime);
                st.push(id);
                prevTime = timeStamp;
            } else {
                ans[id] += (timeStamp-prevTime+1);
                prevTime = timeStamp+1;
                st.pop();
            }
        }
        return ans;
    }
}
// Last updated: 04/04/2026, 23:33:28
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> st = new ArrayList<>();
        int ans = 0;
        for(String op : operations) {
            if(op.equals("D")) {
                st.add(st.get(st.size()-1)*2);
            } else if(op.equals("C")) {
                st.remove(st.size()-1);
            } else if(op.equals("+")) {
                st.add(st.get(st.size()-1)+st.get(st.size()-2));
            } else {
                st.add(Integer.parseInt(op));
            }
        }
        for(int score : st) ans += score;
        return ans;
    }
}
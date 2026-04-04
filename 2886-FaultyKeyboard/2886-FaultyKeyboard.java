// Last updated: 04/04/2026, 23:29:54
class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()) {
            if(ch=='i') {
                ans.reverse();
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
// Last updated: 04/04/2026, 23:26:38
class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            set.add(ch);
            if(set.size() == ((i+1)%3)) {
                ans ++;
            }
        }
        return ans;
    }
}
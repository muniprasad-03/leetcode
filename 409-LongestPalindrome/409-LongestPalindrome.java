// Last updated: 04/04/2026, 23:34:29
class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        boolean hasOdd = false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char key : map.keySet()) {
            int val = map.get(key);
            if(val%2 == 0) {
                ans += val;
            } else {
                ans += val-1;
                hasOdd = true;
            }
        }
        if(hasOdd) ans++;
        return ans;
    }
}
// Last updated: 04/04/2026, 23:39:17
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        int mLen = 0;
        int left =  0, right = 0;
        while(right < s.length()) {
            char ch = s.charAt(right);
            if(m.containsKey(ch) && m.get(ch) >= left)
               left = m.get(ch)+1;
            m.put(ch,right);
            mLen = Math.max(mLen,right-left+1);
            right++;
        }
        return mLen;
    }
}
// Last updated: 04/04/2026, 23:32:31
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];
        int n = words.length;
        for(int i=0;i<order.length();i++) {
            map[order.charAt(i)-'a'] = i;
        }
        for(int i=0;i<n-1;i++) {
            String w1 = words[i];
            String w2 = words[i+1];
            boolean fnd = false;
            int minLen = Math.min(w1.length(), w2.length());
            for(int j=0;j<minLen;j++) {
                char ch1 = w1.charAt(j);
                char ch2 = w2.charAt(j);
                if(ch1 != ch2) {
                    if(map[ch1-'a'] > map[ch2-'a']) return false;
                    fnd = true;
                    break;
                }
            }
            if(!fnd && w1.length() > w2.length()) return false;
        }
        return true;
    }
}
// Last updated: 04/04/2026, 23:34:41
class Solution {
    public char findTheDifference(String s, String t) {
        int[] map = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++) {
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']++;
        }
        map[t.charAt(n)-'a']++;
        for(int i=0;i<26;i++) {
            if(map[i]%2==1) return (char)(97+i);
        }
        return 'a';
    }
}
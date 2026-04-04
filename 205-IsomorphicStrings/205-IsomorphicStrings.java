// Last updated: 04/04/2026, 23:36:00
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        char[] mapStoT =new char[256];
        char[] mapTtoS =new char[256];
        for(int i=0;i<n;i++) {
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(mapStoT[sChar]!=0 && mapStoT[sChar]!=tChar) return false;
            if(mapTtoS[tChar]!=0 && mapTtoS[tChar]!=sChar) return false;
            mapStoT[sChar]=tChar;
            mapTtoS[tChar]=sChar;
        }
        return true;
    }
};
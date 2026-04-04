// Last updated: 04/04/2026, 23:35:56
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int n = s.length();
        char mapStoT[256];
        char mapTtoS[256];
        for(int i=0;i<n;i++) {
            char sChar=s[i];
            char tChar=t[i];
            if(mapStoT[sChar]!=0 && mapStoT[sChar]!=tChar) return false;
            if(mapTtoS[tChar]!=0 && mapTtoS[tChar]!=sChar) return false;
            mapStoT[sChar]=tChar;
            mapTtoS[tChar]=sChar;
        }
        return true;
    }
};
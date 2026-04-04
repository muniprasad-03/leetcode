// Last updated: 04/04/2026, 23:32:01
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans=0;
        boolean mayHave = false;
        for(char ch:text.toCharArray()) {
            if(ch==' ') {
                if(!mayHave) ans++;
                mayHave=false;
            } else {
                if(brokenLetters.indexOf(ch)!=-1) {
                    mayHave=true;
                }
            }
        }
        if(!mayHave) ans++;
        return ans;
    }
}
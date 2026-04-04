// Last updated: 04/04/2026, 23:27:55
class Solution {
    public String maximumXor(String s, String t) {
        int oneCnt=0;
        int zeroCnt=0;
        for(char ch : t.toCharArray()) {
            if(ch=='0') zeroCnt++;
            else oneCnt++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char sChar=s.charAt(i);
            if(sChar=='1' && zeroCnt>0) {
                ans.append('1');
                zeroCnt--;
            } else if(sChar=='0' && oneCnt>0) {
                ans.append('1');
                oneCnt--;
            } else {
                ans.append('0');
                if(sChar=='0') zeroCnt--;
                else oneCnt--;
            }
        }
        return ans.toString();
    }
}
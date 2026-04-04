// Last updated: 04/04/2026, 23:38:10
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int l = s.length();
        int i = l-1;
        while(i>=0) {
            if(s.charAt(i)==' ') {
                i--;
            }
            else {
                break;
            }
        } 
        while(i>=0 && s.charAt(i)!=' ') {
            count++;
            i--;
        }
        return count;
    }
}
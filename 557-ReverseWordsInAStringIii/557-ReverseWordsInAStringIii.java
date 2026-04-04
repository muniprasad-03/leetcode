// Last updated: 04/04/2026, 23:33:45
class Solution {
    public void reverse(StringBuilder str,int start,int end) {
        while(start<end) {
            char ch=str.charAt(start);
            str.setCharAt(start,str.charAt(end));
            str.setCharAt(end,ch);
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder(s);
        int len = ans.length();
        int i=0;
        int j=0;
        while(j<=len) {
            if(j==len || ans.charAt(j)==' ' ) {
                reverse(ans,i,j-1);
                i=j+1;
            }
            j++;
        }
        return ans.toString();
    }
}
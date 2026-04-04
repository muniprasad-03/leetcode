// Last updated: 04/04/2026, 23:31:49
class Solution {
    public boolean hasSame(StringBuilder s,int k) {
        int len=s.length();
        if(len<k) return false;
        char lastChar = s.charAt(len-1);
        for(int i=len-k;i<len;i++) {
            if(s.charAt(i)!=lastChar) return false;
        }
        return true;
    }
    public String removeDuplicates(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int i=0;
        int n=s.length();
        while(i<n) {
            ans.append(s.charAt(i++));
            while(ans.length()>=k && hasSame(ans,k)) {
                ans.delete(ans.length()-k,ans.length());
            }
        }
        return ans.toString();
    }
}
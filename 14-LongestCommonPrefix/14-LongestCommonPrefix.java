// Last updated: 04/04/2026, 23:39:02
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<first.length();i++) {
            if(first.charAt(i)!=last.charAt(i)) return ans.toString();
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
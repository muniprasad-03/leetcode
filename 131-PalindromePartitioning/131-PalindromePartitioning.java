// Last updated: 04/04/2026, 23:36:48
class Solution {
    public boolean isPalindrome(String str,int start,int end) {
        while(start <= end) {
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
    public void helper(String str, int idx, int end,List<String> parts,List<List<String>> ans) {
        if(idx == end) {
            ans.add(new ArrayList<>(parts));
            return;
        }
        for(int i=idx;i<end;i++) {
            if(isPalindrome(str,idx,i)) {
                parts.add(str.substring(idx,i+1));
                helper(str,i+1,end,parts,ans);
                parts.remove(parts.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> parts = new ArrayList<>();
        helper(s,0,s.length(),parts,ans);
        return ans;
    }
}
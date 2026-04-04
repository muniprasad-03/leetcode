// Last updated: 04/04/2026, 23:37:52
class Solution {
    public String simplifyPath(String path) {
        int n = path.length();
        Stack<String> st = new Stack<>();
        int i=0;
        while(i<n) {
            while(i<n && path.charAt(i) =='/') i++;
            StringBuilder folderName = new StringBuilder();
            while(i<n && path.charAt(i) !='/') {
                folderName.append(path.charAt(i++));
            }
            String dir = folderName.toString();
            if(dir.equals("") || dir.equals(".")) continue;
            else if(dir.equals("..")) {
                if(!st.isEmpty()) st.pop();
            } else {
                st.push(folderName.toString());
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String str : st) {
            ans.append("/"+str);
        }
        return ans.length()==0 ? "/" : ans.toString();
    }
}
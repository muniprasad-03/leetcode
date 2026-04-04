// Last updated: 04/04/2026, 23:39:15
class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] listOfStrings = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) listOfStrings[i] = new StringBuilder();
        int idx = 0;
        int len = s.length();
        boolean down = true;
        while(idx < len) {
            if(down) {
                for(int i=0;i<numRows && idx<len;i++) {
                    listOfStrings[i].append(s.charAt(idx++));
                }
                down = false;
            } else {
                for(int i=numRows-2 ;i>0 && idx<len;i--) {
                    listOfStrings[i].append(s.charAt(idx++));
                }
                down = true;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<numRows;i++) ans.append(listOfStrings[i].toString());
        return ans.toString();
    }
}
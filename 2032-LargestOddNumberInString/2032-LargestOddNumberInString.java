// Last updated: 04/04/2026, 23:30:47
class Solution {
    public String largestOddNumber(String num) {
        int j=num.length()-1;
        while(j>=0) {
            if((num.charAt(j)-'0')%2 == 1) return num.substring(0,j+1);
            j--;
        }
        return "";
    }
}
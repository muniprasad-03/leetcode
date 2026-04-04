// Last updated: 04/04/2026, 23:33:53
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int idx = 0;
        while(idx < num1.length() && num1.charAt(idx) != '+') {
            idx++;
        }
        int aReal = Integer.parseInt(num1.substring(0, idx));
        int aImg = Integer.parseInt(num1.substring(idx+1, num1.length()-1));
        idx = 0;
        while(idx < num2.length() && num2.charAt(idx) != '+') {
            idx++;
        }
        int bReal = Integer.parseInt(num2.substring(0, idx));
        int bImg = Integer.parseInt(num2.substring(idx+1, num2.length()-1));
        return ((aReal*bReal) - (aImg*bImg)) + "+" + ((aReal*bImg) + (bReal*aImg)) + "i";
    }
}
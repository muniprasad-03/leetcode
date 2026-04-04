// Last updated: 04/04/2026, 23:34:30
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int idx1 = num1.length()-1;
        int idx2 = num2.length()-1;
        int carry = 0;
        while(idx1>=0 && idx2>=0) {
            int sum = carry + (num1.charAt(idx1--)-'0') + (num2.charAt(idx2--)-'0');
            carry = sum/10;
            ans.append(sum%10);
        }
        while(idx1>=0) {
            int sum = carry + (num1.charAt(idx1--)-'0');
            carry = sum/10;
            ans.append(sum%10);
        }
        while(idx2>=0) {
            int sum = carry + (num2.charAt(idx2--)-'0');
            carry = sum/10;
            ans.append(sum%10);
        }
        if(carry==1) {
            ans.append(1);
        }
        
        return ans.reverse().toString();
    }
}
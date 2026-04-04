// Last updated: 04/04/2026, 23:37:56
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while(i>=0 || j>=0) {
            sum = carry;
            if(i>=0) {
                sum = sum + a.charAt(i--) - '0';
            }
            if(j>=0) {
                sum = sum + b.charAt(j--) - '0';
            }
            ans.append(sum%2);
            carry = sum/2;
        }
        if(carry != 0) {
            ans.append(carry);
        }
        ans.reverse();
        return ans.toString();
    }
}
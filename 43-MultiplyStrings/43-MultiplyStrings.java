// Last updated: 04/04/2026, 23:38:23
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n = num1.length();
        int m = num2.length();
        int[] ans = new int[m+n];
        int carry = 0;
        int p1 = m+n-1;
        int p2 = p1;
        for(int i=m-1; i>=0; i--) {
            carry = 0;
            p2 = p1;
            int d1 = num2.charAt(i)-'0';
            for(int j=n-1;j>=0;j--) {
                int d2 = num1.charAt(j)-'0';
                int sum = carry + ans[p2] + (d1*d2);
                ans[p2] = sum%10;
                carry = sum/10;
                p2--;
            }
            ans[p2] += carry;
            p1--;
        }
        StringBuilder str = new StringBuilder();
        while(p2<n+m && ans[p2]==0) p2++;
        while(p2<n+m) str.append(ans[p2++]);
        return str.toString();
    }
}
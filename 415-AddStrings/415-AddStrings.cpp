// Last updated: 04/04/2026, 23:34:25
class Solution {
public:
    string addStrings(string& num1, string& num2) {
        string ans = "";
        int i = num1.size()-1;
        int j = num2.size()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry!=0) {
            int dig1 = (i>=0) ? num1[i--]-'0' : 0;
            int dig2 = (j>=0) ? num2[j--]-'0' : 0;
            int sum = dig1+dig2+carry;
            carry = sum/10;
            ans.push_back((sum%10)+'0');
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};
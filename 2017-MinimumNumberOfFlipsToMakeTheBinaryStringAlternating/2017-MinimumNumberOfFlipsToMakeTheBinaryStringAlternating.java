// Last updated: 04/04/2026, 23:30:50
class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String str = s+s;
        int left = 0;
        int right = 0;
        int ans = Integer.MAX_VALUE;
        int flip1 = 0;
        int flip2 = 0;
        for(; right < str.length(); right++) {
            char rChar = str.charAt(right);
            if(rChar != (right%2 == 0 ? '1' : '0')) flip1++;
            if(rChar != (right%2 == 0 ? '0' : '1')) flip2++;
            if(right - left + 1 > n) {
                char lChar = str.charAt(left);
                if(lChar != (left%2 == 0 ? '1' : '0')) flip1--;
                if(lChar != (left%2 == 0 ? '0' : '1')) flip2--;
                left++;
            }
            if(right - left + 1 == n) {
                ans = Math.min(ans, Math.min(flip1, flip2));
            }
        }
        return ans;
    }
}
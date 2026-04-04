// Last updated: 04/04/2026, 23:39:03
class Solution {
    public int charToVal(char ch) {
        switch(ch) {
            case 'I' : return 1; 
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++) {
            int curr = charToVal(s.charAt(i));
            int next = i+1 < n ? charToVal(s.charAt(i+1)) : 0; 
            if(curr < next) {
                ans += (next-curr);
                i++;
            } else {
                ans += curr;
            }
        }
        return ans;
    }
}
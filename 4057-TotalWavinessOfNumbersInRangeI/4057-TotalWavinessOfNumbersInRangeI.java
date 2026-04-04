// Last updated: 04/04/2026, 23:27:47
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i=num1;i<=num2;i++) {
            ans += help(i);
        }
        return ans;
    }
    public int help(int num) {
        if(num<100) return 0;
        String s = String.valueOf(num);
        int wav = 0;
        int l = s.length();
        for(int i=1;i<l-1;i++) {
            char prev = s.charAt(i-1);
            char curr = s.charAt(i);
            char next = s.charAt(i+1);
            if(curr>prev && curr>next) wav++;
            else if(curr<prev && curr<next) wav++;
        }
        return wav;
    }
}
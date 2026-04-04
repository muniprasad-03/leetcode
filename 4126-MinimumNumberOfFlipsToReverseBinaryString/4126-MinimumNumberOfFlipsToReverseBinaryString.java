// Last updated: 04/04/2026, 23:27:16
class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int l = s.length();
        int flips = 0;
        for(int i=0;i<l/2;i++) {
            if(s.charAt(i)!=s.charAt(l-1-i)) flips += 2;
        }
        return flips;
    }
}
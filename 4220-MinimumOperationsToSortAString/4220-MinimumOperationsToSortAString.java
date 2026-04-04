// Last updated: 04/04/2026, 23:26:23
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        boolean sorted = true;
        char minChar = 'z';
        char maxChar = 'a';
        for(int i = 0; i<n; i++) {
            if(i<n-1 && chars[i]>chars[i+1]) sorted = false;
            if(chars[i]<minChar) minChar = chars[i];
            if(chars[i]>maxChar) maxChar = chars[i];
        }
        if(sorted) return 0;
        if(n == 2) return-1;
        if(chars[0] == minChar || chars[n-1] == maxChar) {
            return 1;
        }
        if(chars[0] == maxChar && chars[n-1] == minChar) {
            boolean minElsewhere = false;
            for(int i = 0; i<n-1; i++) {
                if(chars[i] == minChar) {
                    minElsewhere = true;
                    break;
                }
            }
            boolean maxElsewhere = false;
            for(int i = 1; i<n; i++) {
                if(chars[i] == maxChar) {
                    maxElsewhere = true;
                    break;
                }
            }
            if(!minElsewhere && !maxElsewhere) {
                return 3;
            }
        }
        return 2;
    }
}
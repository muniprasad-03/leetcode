// Last updated: 04/04/2026, 23:27:51
class Solution {
    public boolean scoreBalance(String s) {
        int len = s.length();
        int[] score = new int[len];
        score[0] = (s.charAt(0)-'a')+1;
        int totScore = score[0];
        for(int i=1;i<len;i++) {
            totScore+=(s.charAt(i)-'a')+1;
            score[i] = score[i-1]+((s.charAt(i)-'a')+1);
        }
        for(int i=0;i<len;i++) {
            int leftScore = score[i];
            int rightScore = totScore-leftScore;
            if(leftScore==rightScore) return true;
        }
        return false;
    }
}
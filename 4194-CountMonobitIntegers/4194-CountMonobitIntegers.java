// Last updated: 04/04/2026, 23:26:34
class Solution {
    private boolean isMonobit(int num) {
        if(num==0) return true;
        String bin = Integer.toBinaryString(num);
        char first = bin.charAt(0);
        for(int i=1;i<bin.length();i++) {
            if(bin.charAt(i)!=first) return false;
        }
        return true;
    }
    public int countMonobit(int n) {
        int cnt = 0;
        for(int i=0;i<=n;i++) {
            if(isMonobit(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
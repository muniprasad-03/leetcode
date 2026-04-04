// Last updated: 04/04/2026, 23:31:41
class Solution {
    private boolean hasZeroes(int num) {
        while(num>0) {
            if(num%10 == 0) return true;
            num/=10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n;i++) {
            if(!hasZeroes(i) && !hasZeroes(n-i)) {
                return new int[]{i,n-i};
            }
        }
        return new int[]{-1,-1};
    }
}
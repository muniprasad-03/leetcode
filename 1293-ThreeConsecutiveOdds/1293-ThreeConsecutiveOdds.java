// Last updated: 04/04/2026, 23:31:57
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<=arr.length-3;i++) {
            if((arr[i]&1)==1 &&(arr[i+1]&1)==1 && (arr[i+2]&1)==1) return true;
        }
        return false;
    }
}
// Last updated: 04/04/2026, 23:31:16
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int curr = 1;
        int idx = 0;
        int missCnt = 0;
        while(true) {
            if(idx<arr.length && arr[idx]==curr) {
                idx++;
            } else {
                missCnt++;
                if(missCnt==k) return curr;
            }
            curr++;
        }
    }
}
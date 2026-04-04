// Last updated: 04/04/2026, 23:28:57
class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] pair : restrictions) {
            map.put(pair[0],pair[1]);
        }
        int[] a = new int[n];
        a[0] = 0;
        for(int i=1;i<n;i++) {
            a[i] = a[i-1]+diff[i-1];
            if(map.containsKey(i)) {
                a[i] = Math.min(a[i], map.get(i));
            }
        }
        for(int i=n-2;i>=0;i--) {
            a[i] = Math.min(a[i], a[i+1]+diff[i]);
            if(map.containsKey(i)) {
                a[i] = Math.min(a[i], map.get(i));
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int num : a) {
            ans = Math.max(ans, num);
        }
        return ans;
    }
}
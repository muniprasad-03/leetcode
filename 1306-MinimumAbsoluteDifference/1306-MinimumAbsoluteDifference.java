// Last updated: 04/04/2026, 23:31:55
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<n;i++) {
            int diff = arr[i] - arr[i-1];
            if(diff == minDiff) {
                ans.add(Arrays.asList(arr[i-1], arr[i]));
            } else if(diff < minDiff) {
                minDiff = diff;
                ans = new ArrayList<>();
                ans.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return ans;
    }
}
// Last updated: 04/04/2026, 23:38:07
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        int idx = 0;
        while(idx<n && intervals[idx][1] < newInterval[0]) {
            ans.add(intervals[idx]);
            idx++;
        }
        while(idx<n && intervals[idx][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0],intervals[idx][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[idx][1]);
            idx++;
        }
        ans.add(newInterval);
        while(idx<n) {
            ans.add(intervals[idx]);
            idx++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
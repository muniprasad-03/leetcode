// Last updated: 04/04/2026, 23:38:08
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int idx = 0;
        while(idx < n) {
            int currStart = intervals[idx][0];
            int currEnd = intervals[idx][1];
            while(idx+1 < n && currEnd >= intervals[idx + 1][0]) {
                currEnd = Math.max(currEnd, intervals[idx + 1][1]);
                idx++;
            }
            ans.add(new int[]{currStart, currEnd});
            idx++;
        }
        int[][] ansArr = new int[ans.size()][2];
        for(int i = 0;i<ans.size();i++) {
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }
}
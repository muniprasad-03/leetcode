// Last updated: 28/06/2026, 08:32:45
1class Solution {
2    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
3        Arrays.sort(occupiedIntervals,(a, b) -> Integer.compare(a[0], b[0]));
4        List<int[]> mergedIntervals = new ArrayList<>();
5        int[] current = occupiedIntervals[0];
6        for(int i = 1; i < occupiedIntervals.length; i++) {
7            int[] next = occupiedIntervals[i];
8            if(next[0] <= current[1] + 1) {
9                current[1] = Math.max(current[1], next[1]);
10            } else {
11                mergedIntervals.add(current);
12                current = next;
13            }
14        }
15        mergedIntervals.add(current);
16        List<List<Integer>> result = new ArrayList<>();
17        for(int[] interval : mergedIntervals) {
18            int start = interval[0];
19            int end = interval[1];
20            if(end < freeStart || start > freeEnd) {
21                result.add(Arrays.asList(start, end));
22            } else {
23                if(start < freeStart) {
24                    result.add(Arrays.asList(start, freeStart - 1));
25                }
26                if(end > freeEnd) {
27                    result.add(Arrays.asList(freeEnd + 1, end));
28                }
29            }
30        }
31        return result;
32    }
33}
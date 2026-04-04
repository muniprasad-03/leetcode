// Last updated: 04/04/2026, 23:28:30
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinTime = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int finLand = landStartTime[i]+landDuration[i];
                int stWater = Math.max(waterStartTime[j],finLand);
                int totTime1 = stWater+waterDuration[j];
                minFinTime = Math.min(minFinTime,totTime1);

                int finWater = waterStartTime[j]+waterDuration[j];
                int stLand = Math.max(landStartTime[i],finWater);
                int totTime2 = stLand + landDuration[i];
                minFinTime = Math.min(minFinTime,totTime2);
            }
        }
        return minFinTime;
    }
}
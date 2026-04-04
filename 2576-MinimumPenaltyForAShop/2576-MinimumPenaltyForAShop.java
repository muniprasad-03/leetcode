// Last updated: 04/04/2026, 23:30:01
class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int maxPenaulty = 0;
        for(int i=0;i<n;i++) {
            if(customers.charAt(i)=='Y') maxPenaulty++;
        }
        int minPenaulty = maxPenaulty;
        int ans = 0;
        for(int i=0;i<n;i++) {
            if(customers.charAt(i)=='Y') {
                maxPenaulty--;
            } else {
                maxPenaulty++;
            }
            if(maxPenaulty < minPenaulty) {
                maxPenaulty = minPenaulty;
                ans = i+1;
            }
        }
        return ans;
    }
}
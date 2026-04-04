// Last updated: 04/04/2026, 23:29:33
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int totApples = 0;
        for(int apls : apple) totApples += apls;
        int ans = 0;
        int i=capacity.length-1;
        while(i>=0 && totApples > 0) {
            ans++;
            totApples -= capacity[i--];
        }
        return ans;
    }
}
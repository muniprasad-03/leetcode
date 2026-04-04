// Last updated: 04/04/2026, 23:30:17
class Solution {
    public int validSpells(int num,int[] potions,long success) {
        int len = 0;
        int start = 0;
        int end = potions.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if((long)num*potions[mid]>=success) {
                len += (end-mid+1);
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return len;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = spells.length;
        int n = potions.length;
        int[] ans = new int[m];
        for(int i=0;i<m;i++) {
            ans[i] = validSpells(spells[i],potions,success);
        }
        return ans;
    }
}
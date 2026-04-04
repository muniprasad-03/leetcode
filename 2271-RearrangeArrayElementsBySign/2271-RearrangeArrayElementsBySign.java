// Last updated: 04/04/2026, 23:30:27
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int posIdx = 0;
        int negIdx = 1;
        for(int num:nums) {
            if(num>0) {
                ans[posIdx] = num;
                posIdx+=2;
            }
            else {
                ans[negIdx] = num;
                negIdx+=2;
            }
        }
        return ans;
    }
}
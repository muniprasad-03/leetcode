// Last updated: 04/04/2026, 23:34:04
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int l=nums.length;
        int count = 0;
        while(i<l) {
            int temp = 0;
            while((i<l) && (nums[i] == 0)) i++;
            while((i<l) && (nums[i] == 1)) {
                temp++;
                i++;
            }
            if(temp > count)    count = temp;
        }
        return count;
    }
}
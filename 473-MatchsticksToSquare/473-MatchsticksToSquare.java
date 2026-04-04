// Last updated: 04/04/2026, 23:34:06
class Solution {
    private boolean backtrack(int idx, int sideLen, int[] matchsticks, int[] sides) {
        if(idx == matchsticks.length) {
            return sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3];
        }
        for(int i=0;i<4;i++) {
            if(matchsticks[idx]+sides[i] <= sideLen) {
                sides[i] += matchsticks[idx];
                if(backtrack(idx+1, sideLen, matchsticks, sides)) return true;
                sides[i] -= matchsticks[idx];
            }
        }
        return false;
    }
    private void reverse(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for(int num : matchsticks) {
            sum += num;
        }
        if(sum % 4 != 0) return false;
        int sideLen = sum/4;
        int[] sides = new int[4];
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        return backtrack(0, sideLen, matchsticks, sides);
    }
}
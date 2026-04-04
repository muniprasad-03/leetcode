// Last updated: 04/04/2026, 23:27:46
class Solution {
    public int alternatingSum(int[] nums) {
        boolean add = true;
        int sum = 0;
        for(int num : nums) {
            if(add) {
                sum += num;
            } else {
                sum -= num;
            }
            add = !add;
        }
        return sum;
    }
}
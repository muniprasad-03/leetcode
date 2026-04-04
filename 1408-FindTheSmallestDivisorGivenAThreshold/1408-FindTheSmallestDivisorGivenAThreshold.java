// Last updated: 04/04/2026, 23:31:48
class Solution {
    public int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            max = Math.max(max,num);
        }
        return max;
    }
    public boolean validate(int[] nums,int threshold,int div) {
        int sum = 0;
        for(int num : nums) {
            sum +=(int)Math.ceil((double)num/div);//or (num + div - 1) / div 
        }
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int start  = 1;
        int end = max(nums);
        while(start < end) {
            int mid = start + (end-start)/2;
            if(validate(nums,threshold,mid)) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
}
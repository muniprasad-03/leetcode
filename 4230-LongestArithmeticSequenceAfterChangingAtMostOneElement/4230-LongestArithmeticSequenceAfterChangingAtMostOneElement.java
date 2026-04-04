// Last updated: 04/04/2026, 23:26:18
class Solution {
    public int longestArithmetic(int[] nums) {
        int n = nums.length;
        if(n <= 3) return n;
        int maxLen = 0;
        maxLen = Math.max(maxLen, solve(nums));
        reverse(nums);
        maxLen = Math.max(maxLen, solve(nums));
        return maxLen;
    }
    private int solve(int[] nums) {
        int n = nums.length;
        int max = 0;
        int i=0;
        while(i < n-1) {
            int j = i + 1;
            int d = nums[j] - nums[i];
            while(j<n && nums[j]-nums[j-1] == d) {
                j++;
            }
            if(j == n) {
                max = Math.max(max, j-i);
            } else {
                max = Math.max(max, j - i +1);
                if(j+1<n && nums[j+1]-nums[j-1] == 2*d) {
                    int k = j + 1;
                    while(k+1 < n && nums[k + 1]-nums[k] == d) {
                        k++;
                    }
                    max = Math.max(max, k - i +1);
                }
            }
            i = j - 1;
        }
        return max;
    }
    private void reverse(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++; r--;
        }
    }
}
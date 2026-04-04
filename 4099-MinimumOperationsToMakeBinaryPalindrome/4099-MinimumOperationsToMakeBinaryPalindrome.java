// Last updated: 04/04/2026, 23:27:28
class Solution {
    private boolean isPalindrome(int num) {
        String bin = Integer.toBinaryString(num);
        int left = 0;
        int right = bin.length()-1;
        while(left<right) {
            if(bin.charAt(left) != bin.charAt(right)) return false;
            left++;right--;
        }
        return true;
    }
    private int findMinOps(int num) {
        int up = num;
        int down = num;
        while(true) {
            if(isPalindrome(up)) {
                return up-num;
            }
            if(isPalindrome(down)) {
                return num - down;
            }
            up++;
            down--;
        }
    }
    public int[] minOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            ans[i] = findMinOps(nums[i]);
        }
        return ans;
    }
}
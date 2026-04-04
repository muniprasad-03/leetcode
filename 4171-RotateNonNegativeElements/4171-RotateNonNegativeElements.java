// Last updated: 04/04/2026, 23:26:49
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        List<Integer> positives = new ArrayList<>();
        for(int num : nums) {
            if(num >= 0) {
                positives.add(num);
            }
        }
        int m = positives.size();
        if (m == 0) return nums;
        
        k = k % m;
        int[] rotated = new int[m];
        for(int i = 0;i<m;i++) {
            rotated[i] = positives.get((i + k) % m);
        }
        int j = 0;
        for(int i = 0;i<n;i++) {
            if(nums[i] >= 0) {
                nums[i] = rotated[j++];
            }
        }
        return nums;
    }
}
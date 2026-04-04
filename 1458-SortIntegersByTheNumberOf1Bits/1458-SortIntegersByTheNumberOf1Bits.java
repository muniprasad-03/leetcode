// Last updated: 04/04/2026, 23:31:38
class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] nums = new Integer[n];
        for(int i=0;i<n;i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (a, b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);
            if(bitsA != bitsB) {
                return Integer.compare(bitsA, bitsB);
            }
            return Integer.compare(a, b);
        });
        for(int i=0;i<n;i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
}
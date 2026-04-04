// Last updated: 04/04/2026, 23:27:01
class Solution {
    private static int getBinReflection(int n) {
        int ref = 0;
        while(n>0) {
            ref=(ref<<1)|(n&1);
            n>>=1;
        }
        return ref;
    }
    public int[] sortByReflection(int[] nums) {
        Integer[] numbers = new Integer[nums.length];
        for(int i=0;i<nums.length;i++) {
            numbers[i] = nums[i];
        }
        Arrays.sort(numbers, (a,b)-> {
            int refA = getBinReflection(a);
            int refB = getBinReflection(b);
            if(refA != refB) return Integer.compare(refA, refB);
            return Integer.compare(a,b);
        });
        for(int i=0;i<nums.length;i++) {
            nums[i] = numbers[i];
        }
        return nums;
    }
}
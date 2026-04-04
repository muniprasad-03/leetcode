// Last updated: 04/04/2026, 23:30:10
class Solution {
    public int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }    
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(reverseNumber(num));
        }
        return set.size();
    }
}
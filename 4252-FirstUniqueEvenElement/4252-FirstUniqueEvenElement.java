// Last updated: 04/04/2026, 23:26:08
class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int num : nums) {
            if(num % 2 == 0 && freq.get(num) == 1) return num;
        }
        return -1;
    }
}
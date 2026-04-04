// Last updated: 04/04/2026, 23:26:24
class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> freqOfFreq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int f : freq.values()) {
            freqOfFreq.put(f, freqOfFreq.getOrDefault(f, 0)+1);
        }
        for(int num : nums) {
            if(freq.containsKey(num) && freqOfFreq.get(freq.get(num))==1) {
                return num;
            }
        }
        return -1;
    }
}
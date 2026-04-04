// Last updated: 04/04/2026, 23:28:52
class Solution {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];
        for(char ch:s.toCharArray()) arr[ch-'a']++;
        Set<Integer> vowSet = Set.of(0,4,8,14,20);
        int vovMax = 0;
        int constMax = 0;
        for(int idx=0;idx<26;idx++) {
            if(vowSet.contains(idx)) {
                vovMax = Math.max(vovMax,arr[idx]);
            } else {
                constMax = Math.max(constMax,arr[idx]);
            }
        }
        return vovMax+constMax;
    }
}
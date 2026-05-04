// Last updated: 04/05/2026, 23:30:58
class Solution {
    public int mirrorFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int totalSum = 0;
        Set<Character> vis = new HashSet<>();
        for(char c : freq.keySet()) {
            if(vis.contains(c)) continue;
            char m = getMirror(c);
            int freqC = freq.get(c);
            int freqM = freq.getOrDefault(m, 0);
            totalSum += Math.abs(freqC-freqM);
            vis.add(c);
            vis.add(m);
        }
        return totalSum;
    }
    private char getMirror(char c) {
        if(Character.isDigit(c)) {
            return (char)('9'-(c-'0'));
        } else {
            return (char)('z'-(c-'a'));
        }
    }
}
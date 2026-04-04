// Last updated: 04/04/2026, 23:33:41
class Solution {
    public boolean isSame(int[] f1, int[] f2) {
        for (int i = 0; i < 26; i++) {
            if (f1[i] != f2[i]) return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        if (l1 > l2) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Build frequency array for s1
        for (int i = 0; i < l1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // Sliding window
        for (int i = l1; i < l2; i++) {
            if (isSame(freq1, freq2)) return true;
            freq2[s2.charAt(i) - 'a']++;                   // include next char
            freq2[s2.charAt(i - l1) - 'a']--;               // remove leftmost
        }

        // Check last window
        return isSame(freq1, freq2);
    }
}

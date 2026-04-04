// Last updated: 04/04/2026, 23:31:53
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        int[] prev = new int[26];
        Arrays.fill(prev, -1); 

        for (String w : words) {
            int[] curr = new int[26];
            for (char c : w.toCharArray()) {
                curr[c - 'a']++;
            }
            
            boolean same = true;
            for (int i = 0; i < 26; i++) {
                if (curr[i] != prev[i]) {
                    same = false;
                    break;
                }
            }
            
            if (!same) {
                ans.add(w);
                prev = curr;
            }
        }
        return ans;
    }
}
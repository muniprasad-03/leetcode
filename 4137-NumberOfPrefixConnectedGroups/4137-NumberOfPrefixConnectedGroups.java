// Last updated: 04/04/2026, 23:27:10
class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String, Integer> prefCnt = new HashMap<>();
        for(String word : words) {
            if(word.length() < k) continue;
            String prefix = word.substring(0, k);
            prefCnt.put(prefix, prefCnt.getOrDefault(prefix, 0)+1);
        }
        int ans = 0;
        for(int val : prefCnt.values()) {
            if(val>=2) ans++;
        }
        return ans;
    }
}
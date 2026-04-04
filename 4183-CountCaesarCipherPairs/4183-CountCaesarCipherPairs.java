// Last updated: 04/04/2026, 23:26:40
class Solution {
    private String normalize(String s) {
        int m = s.length();
        char[] arr = new char[m];
        int diff = s.charAt(0)-'a';
        for(int i=0;i<m;i++) {
            char ch = s.charAt(i);
            int currPos = ch-'a';
            int shifted = (currPos-diff+26)%26;
            arr[i] = (char)(shifted+'a');
        }
        return new String(arr);
    }
    public long countPairs(String[] words) {
        HashMap<String, Long> map = new HashMap<>();
        long ans = 0;
        for(String str : words) {
            String norm = normalize(str);
            map.put(norm, map.getOrDefault(norm, 0L)+1);
        }
        for(String key : map.keySet()) {
            long cnt = map.get(key);
            ans += (cnt*(cnt-1)/2);
        }
        return ans;
    }
}
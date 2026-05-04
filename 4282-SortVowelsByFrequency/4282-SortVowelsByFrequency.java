// Last updated: 04/05/2026, 23:30:53
class Solution {
    static class Pair {
        int firstIdx;
        int freq;
        Pair(int firstIdx) {
            this.firstIdx = firstIdx;
            this.freq = 1;
        }
    }
    
    public String sortVowels(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder(s);
        String vows = "aeiou";
        HashMap<Character, Pair> map = new HashMap<>();
        List<Integer> indices = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(vows.indexOf(ch) == -1) continue;
            
            indices.add(i);
            if(map.containsKey(ch)) {
                map.get(ch).freq++;
            } else {
                map.put(ch, new Pair(i));
            }
        }
        
        List<Character> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (a, b) -> {
            if(map.get(a).freq != map.get(b).freq) {
                return Integer.compare(map.get(b).freq, map.get(a).freq);
            }
            return Integer.compare(map.get(a).firstIdx, map.get(b).firstIdx);
        });
        int idx = 0;
        for(char ch : keys) {
            int count = map.get(ch).freq;
            for(int i=0; i<count; i++) {
                ans.setCharAt(indices.get(idx++), ch);
            }
        }
        return ans.toString();
    }
}
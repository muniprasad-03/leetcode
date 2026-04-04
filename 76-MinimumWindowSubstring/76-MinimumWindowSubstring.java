// Last updated: 04/04/2026, 23:37:45
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int left = 0;
        int right = 0;
        int startIdx = -1;
        int count = 0;
        int len = Integer.MAX_VALUE;
        while(right < s.length()) {
            char rightCh = s.charAt(right);
            if(map.containsKey(rightCh)) {
                if(map.get(rightCh) > 0) {
                    count++;
                }
                map.put(rightCh, map.get(rightCh)-1);
            }
            while(count == t.length()) {
                if(right - left + 1 < len) {
                    len = right - left + 1;
                    startIdx = left;
                }
                char leftCh = s.charAt(left);
                if(map.containsKey(leftCh)) {
                    map.put(leftCh, map.get(leftCh)+1);
                    if(map.get(leftCh)>0) {
                        count--;
                    }
                }
                left++;
            }
            right++;
        }
        return len==Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx+len);
    }
}
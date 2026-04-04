// Last updated: 04/04/2026, 23:31:27
class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int n = s.length();
        for(int i=0;i+k<=n;i++) {
            set.add(s.substring(i, i+k));
        }
        return set.size() == Math.pow(2, k);
    }
}
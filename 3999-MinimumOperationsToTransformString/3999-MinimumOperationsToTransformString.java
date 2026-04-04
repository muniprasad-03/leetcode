// Last updated: 04/04/2026, 23:28:19
class Solution {
    public int minOperations(String s) {
        int maxOps = 0;
        for(char c:s.toCharArray()) {
            int stepNeed = (26-(c-'a'))%26;
            maxOps = Math.max(maxOps,stepNeed);
        }
        return maxOps;
    }
}
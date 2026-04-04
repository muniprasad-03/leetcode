// Last updated: 04/04/2026, 23:35:18
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] temp1 = s.toCharArray();
        Arrays.sort(temp1);
        char[] temp2 = t.toCharArray();
        Arrays.sort(temp2);
        return Arrays.equals(temp1,temp2);
    }
}
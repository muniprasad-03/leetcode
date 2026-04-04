// Last updated: 04/04/2026, 23:31:56
class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count <= 2) {
                    str.append(s.charAt(i));
                }
            } else {
                str.append(s.charAt(i));
                count = 1;
            }
        }
        return s.charAt(0) + str.toString();
    }
}

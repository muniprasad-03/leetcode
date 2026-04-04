// Last updated: 04/04/2026, 23:31:02
class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return x * remove(s, "a", "b") + y * remove(remaining, "b", "a");
        } else {
            return y * remove(s, "b", "a") + x * remove(remaining, "a", "b");
        }
    }
    String remaining = "";
    private int remove(String s, String first, String second) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == first.charAt(0) && c == second.charAt(0)) {
                sb.deleteCharAt(sb.length() - 1);
                count++;
            } else {
                sb.append(c);
            }
        }
        remaining = sb.toString();
        return count;
    }
}

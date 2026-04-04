// Last updated: 04/04/2026, 23:27:52
class Solution {
    public long removeZeros(long n) {
        String str = Long.toString(n);
        str = str.replace("0","");
        return Long.parseLong(str);
    }
}
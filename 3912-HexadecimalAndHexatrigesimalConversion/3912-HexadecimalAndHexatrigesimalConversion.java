// Last updated: 04/04/2026, 23:28:47
class Solution {
    public String concatHex36(int n) {
        long square = n*n;
        long cube = n*n*n;
        String hexString = Long.toHexString(square);
        String hexTriString = Long.toString(cube,36);
        return (hexString+hexTriString).toUpperCase();
    }
}
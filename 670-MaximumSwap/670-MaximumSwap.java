// Last updated: 04/04/2026, 23:33:30
class Solution {
    private int findNextMax(char[] digits, int i) {
        int n = digits.length;
        int maxIdx = i;
        for(int j=i;j<n;j++) {
            if(digits[j] >= digits[maxIdx]) {
                maxIdx = j;
            }
        }
        return maxIdx;
    }
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;
        for(int i=0;i<n-1;i++) {
            char curr = digits[i];
            int maxIdx = findNextMax(digits, i+1);
            if(curr < digits[maxIdx]) {
                digits[i] = digits[maxIdx];
                digits[maxIdx] = curr;
                return Integer.parseInt(new String(digits));
            }
        }
        return num;
    }
}
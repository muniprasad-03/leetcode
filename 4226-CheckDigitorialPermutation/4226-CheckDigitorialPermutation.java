// Last updated: 04/04/2026, 23:26:20
class Solution {
    private static final int[] FACTORIAL = new int[10];
    static {
        FACTORIAL[0] = 1;
        for (int i = 1; i<10; i++) {
            FACTORIAL[i] = i*FACTORIAL[i-1];
        }
    }
    public boolean isDigitorialPermutation(int n) {
        int temp = n;
        int factorialSum = 0;
        int[] origFreq = new int[10];
        int originalDigitCount = 0;
        while (temp>0) {
            int digit = temp%10;
            factorialSum+=FACTORIAL[digit];
            origFreq[digit]++;
            temp /= 10;
            originalDigitCount++;
        }
        String sumStr =Integer.toString(factorialSum);
        if (sumStr.length() != originalDigitCount || sumStr.charAt(0) == '0') {
            return false;
        }
        int[] sumFreq =new int[10];
        for (char c : sumStr.toCharArray()) {
            sumFreq[c-'0']++;
        }
        return Arrays.equals(origFreq, sumFreq);
    }
}
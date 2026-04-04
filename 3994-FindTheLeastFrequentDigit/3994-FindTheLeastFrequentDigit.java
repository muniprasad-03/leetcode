// Last updated: 04/04/2026, 23:28:29
class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        int result = 0;
        while(n>0) {
            freq[n%10]++;
            n/=10;
        }
        int minFreq = Integer.MAX_VALUE;
        for(int i=0;i<10;i++) {
            if(freq[i]>0 && freq[i]<minFreq) {
                minFreq = freq[i];
                result = i;
            }
        }
        return result;
    }
}
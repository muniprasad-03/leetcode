// Last updated: 04/04/2026, 23:28:24
class Solution {
public:
    int getLeastFrequentDigit(int n) {
        int freq[10] = {0};
        if(n==0) freq[0]++;
        while(n>0) {
            freq[n % 10]++;
            n = n/10;
        }
        int minValue = INT_MAX;
        int ans = 0;
        for(int i=0;i<10;i++) {
            // should consider digits that actually appeared in the number i.e freq[i] > 0
            if(freq[i] > 0 && freq[i] < minValue) {
                minValue = freq[i];
                ans = i;
            }
        }
        return ans;
    }
};
// Last updated: 04/04/2026, 23:30:19
class Solution {
public:
    int minBitFlips(int start, int goal) {
        int ans = 0;
        int XOR = start^goal;
        while(XOR>0) {
            ans+=(XOR&1);
            XOR>>=1;
        }
        return ans;
    }
};
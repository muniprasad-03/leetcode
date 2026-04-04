// Last updated: 04/04/2026, 23:36:18
class Solution {
public:
    string fractionToDecimal(int numerator, int denominator) {
        if(numerator==0) return "0";
        string result;
        if((numerator<0) ^ (denominator<0)) {
            result.push_back('-');
        }
        long long n=abs((long long)numerator);
        long long d=abs((long long)denominator);
        result += to_string(n/d);
        long long remainder=n%d;
        if(remainder==0) return result;
        result.push_back('.');
        unordered_map<long long,int> remMap;
        while(remainder!=0) {
            if(remMap.find(remainder)!=remMap.end()) {
                int idx=remMap[remainder];
                result.insert(idx,"(");
                result.push_back(')');
                break;
            }
            remMap[remainder]=result.length();
            remainder*=10;
            result.push_back('0'+remainder/d);
            remainder%=d;
        }
        return result;
    }
};
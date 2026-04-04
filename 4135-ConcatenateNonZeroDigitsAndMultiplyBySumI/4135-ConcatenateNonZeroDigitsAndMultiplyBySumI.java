// Last updated: 04/04/2026, 23:27:12
class Solution {
    public long sumAndMultiply(int n) {
        int temp = n;
        StringBuilder str = new StringBuilder();
        int sum = 0;
        while(temp > 0) {
            int dig = temp % 10;
            if(dig!=0) {
                str.append(dig);
                sum += dig;
            }
            temp /= 10;
        }
        str.reverse();
        if(str.length()==0) return 0;
        int num = Integer.parseInt(str.toString());
        return (long)num*sum;
    }
}
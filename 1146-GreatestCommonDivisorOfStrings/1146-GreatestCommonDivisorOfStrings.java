// Last updated: 04/04/2026, 23:32:04
class Solution {
    private String GCD(StringBuilder a, StringBuilder b) {
        while(a.indexOf(b.toString()) == 0) {
            if(b.length() == 0) return a.toString();
            StringBuilder temp;
            int idx = a.indexOf(b.toString());
            while(idx == 0) {
                a.delete(idx, idx+b.length());
                idx = a.indexOf(b.toString());
            }
            temp = a;
            a = b;
            b = temp;
        }
        return "";
    }
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder a = new StringBuilder(str1);
        StringBuilder b = new StringBuilder(str2);
        if(a.length()>b.length()) return GCD(a,b);
        else return GCD(b,a);
    }
}
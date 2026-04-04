// Last updated: 04/04/2026, 23:27:27
class Solution {
    private boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i*i <= n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    
    public boolean completePrime(int num) {
        String str = String.valueOf(num);
        int n = str.length();
        
        for(int i=1;i<=n;i++) {
            String pref = str.substring(0,i);
            int prefNum = Integer.parseInt(pref);
            if(!isPrime(prefNum)) {
                return false;
            }
        }
        
        for(int i=0;i<n;i++) {
            String suff = str.substring(i);
            int suffNum = Integer.parseInt(suff);
            if(!isPrime(suffNum)) {
                return false;
            }
        }
        return true;
    }
}
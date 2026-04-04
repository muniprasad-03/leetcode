// Last updated: 04/04/2026, 23:29:50
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                boolean c=false;
                for (int j=0; j<s2.length(); j++){
                    if (s1.charAt(i)==s2.charAt(j) && Math.abs(j-i) == 2){
                        c=true;
                        break;
                    }
                }
                if (!c){
                    return false;
                }
            }
        }
        return true;
    }
}
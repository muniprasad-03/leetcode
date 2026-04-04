// Last updated: 04/04/2026, 23:30:57
class Solution {
    public int secondHighest(String s) {
        boolean[] map=new boolean[10];
        for(char ch:s.toCharArray()) {
            if(ch>='0' && ch<='9' && map[ch-'0']==false) {
                map[ch-'0']=true;
            }
        }
        int c=0;
        for(int i=9;i>=0;i--) {
            if(map[i]==true) {
                c++;
            }
            if(c==2) return i;
        }
        return -1;
    }
}
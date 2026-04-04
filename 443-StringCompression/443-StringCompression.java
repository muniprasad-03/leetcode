// Last updated: 04/04/2026, 23:34:19
class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int idx  = 0;
        for(int i=0;i<len;) {
            char ch = chars[i];
            int count = 0;
            while(i<len && chars[i]==ch) {
                count++;
                i++;
            }
            if(count==1) {
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                String s = Integer.toString(count);
                for(char c : s.toCharArray()) {
                    chars[idx++] = c;
                } 
            }
        }
        return idx;
    }
}
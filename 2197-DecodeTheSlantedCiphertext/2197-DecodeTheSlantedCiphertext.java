// Last updated: 04/04/2026, 23:30:33
class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols = encodedText.length()/rows;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<cols;i++) {
            int r = 0;
            int c = i;
            while(r < rows && c < cols) {
                ans.append(encodedText.charAt(r*cols+c));
                r++;
                c++;
            }
        }
        for(int i=ans.length()-1; i>=0; i--) {
            if(ans.charAt(i) != ' ') return ans.substring(0, i+1);
        }
        return "";
    }
}
// Last updated: 05/05/2026, 10:42:49
class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;   
        int moves = 0; 

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else { // ch == ')'
                if (open > 0) {
                    open--;  
                } else {
                    moves++; 
                }
            }
        }
        return moves + open;
    }
}
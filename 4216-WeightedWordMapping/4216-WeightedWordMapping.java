// Last updated: 04/04/2026, 23:26:25
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String str : words) {
            int sum = 0;
            for(char ch : str.toCharArray()) {
                sum += weights[ch-'a'];
            }
            int rem = sum%26;
            ans.append((char)('z'-rem));
        }
        return ans.toString();
    }
}
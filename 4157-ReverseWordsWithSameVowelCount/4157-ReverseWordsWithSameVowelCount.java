// Last updated: 04/04/2026, 23:26:57
class Solution {
    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
    private int countVowels(String s) {
        int vows = 0;
        for(char ch : s.toCharArray()) {
            if(isVowel(ch)) vows++;
        }
        return vows;
    }
    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public String reverseWords(String s) {
        String[] strList = s.split(" ");
        int firstVowelCnt = countVowels(strList[0]);
        for(int i=1;i<strList.length;i++) {
            if(countVowels(strList[i])==firstVowelCnt) {
                strList[i] = reverse(strList[i]);
            }
        }
        return String.join(" ",strList);
    }
}
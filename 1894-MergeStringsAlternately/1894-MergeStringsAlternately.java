// Last updated: 04/04/2026, 23:30:58
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        char[] ansArray = new char[len1+len2];
        int i=0,j=0,k=0;
        while(i<len1 && j<len2) {
            ansArray[k++] = word1.charAt(i++);
            ansArray[k++] = word2.charAt(j++);
        }
        while(i<len1) ansArray[k++] = word1.charAt(i++);
        while(j<len2) ansArray[k++] = word2.charAt(j++);
        return new String(ansArray);
    }
}
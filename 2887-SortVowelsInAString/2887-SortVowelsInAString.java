// Last updated: 04/04/2026, 23:29:53
class Solution {
    boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String sortVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        List<Integer> vowIdx = new ArrayList<>();
        List<Character> vowList = new ArrayList<>();
        for(int i=0;i<ans.length();i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) {
                vowIdx.add(i);
                vowList.add(ch);
            }
        }
        Collections.sort(vowList);
        for(int i=0;i<vowIdx.size();i++){
            ans.setCharAt(vowIdx.get(i),vowList.get(i));
        }
        return ans.toString();
    }
}
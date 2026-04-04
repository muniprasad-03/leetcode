// Last updated: 04/04/2026, 23:38:53
class Solution {
    private static Map<Character,String> phoneKeyMap = new HashMap<>();
    static {
        phoneKeyMap.put('2',"abc");
        phoneKeyMap.put('3',"def");
        phoneKeyMap.put('4',"ghi");
        phoneKeyMap.put('5',"jkl");
        phoneKeyMap.put('6',"mno");
        phoneKeyMap.put('7',"pqrs");
        phoneKeyMap.put('8',"tuv");
        phoneKeyMap.put('9',"wxyz");
    }
    public void generate(String digits,int dIdx,StringBuilder currStr,List<String> ans) {
        if(dIdx==digits.length()) {
            ans.add(new String(currStr.toString()));
            return;
        }
        String keyStr = phoneKeyMap.get(digits.charAt(dIdx));
        for(int j=0;j<keyStr.length();j++) {
            currStr.append(keyStr.charAt(j));
            generate(digits,dIdx+1,currStr,ans);
            currStr.delete(currStr.length()-1,currStr.length());
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        generate(digits,0,new StringBuilder(),ans);
        return ans;
    }
}
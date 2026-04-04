// Last updated: 04/04/2026, 23:32:25
class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {

        String[] ans = new String[queries.length];
        int idx=0;

        Set<String> set=new HashSet<>();
        for(String str : wordlist) set.add(str);

        HashMap<String,String> caseMap = new HashMap<>();
        for(String str:wordlist) {
            String key=str.toLowerCase();
            if(!caseMap.containsKey(key)) {
                caseMap.put(key,str);
            }
        }

        HashMap<String,String> vowMap = new HashMap<>();
        for(String str:wordlist) {
            String key = vowBalancer(str.toLowerCase());
            if(!vowMap.containsKey(key)) {
                vowMap.put(key,str);
            }
        }

        for(String query : queries) {
            if(set.contains(query)) {
                ans[idx]=query;
            } else if(caseMap.containsKey(query.toLowerCase())) {
                ans[idx]=caseMap.get(query.toLowerCase());
            } else {
                String vowKey = vowBalancer(query.toLowerCase());
                if(vowMap.containsKey(vowKey)){
                    ans[idx]=vowMap.get(vowKey);
                } else {
                    ans[idx]="";
                }
            }
            idx++;
        }
        return ans;
    }

    public String vowBalancer(String s) {
        String vowels = "aeiou";
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length();i++) {
            if(vowels.indexOf(str.charAt(i))!=-1) {
                str.setCharAt(i,'.');
            }
        }
        return str.toString();
    }
}
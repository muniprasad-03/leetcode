// Last updated: 04/04/2026, 23:38:16
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hp = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            String str = strs[i];
            char[] s = str.toCharArray();
            Arrays.sort(s);
            str = new String(s);
            if(hp.containsKey(str)) {
                hp.get(str).add(strs[i]);
            }
            else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                hp.put(str,temp);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key : hp.keySet()) {
            ans.add(hp.get(key));
        }
        return ans;
    }
}
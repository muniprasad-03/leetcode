// Last updated: 04/04/2026, 23:32:39
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(String str : arr1) {
            map1.put(str, map1.getOrDefault(str,0)+1);
        }
        for(String str : arr2) {
            map2.put(str, map2.getOrDefault(str,0)+1);
        }
        List<String> ans = new ArrayList<>();
        for(String key : map1.keySet()) {
            if(map1.get(key) == 1 && !map2.containsKey(key)) {
                ans.add(key);
            }
        }
        for(String key : map2.keySet()) {
            if(map2.get(key) == 1 && !map1.containsKey(key)) {
                ans.add(key);
            }
        }
        return ans.toArray(new String[0]);
    }
}
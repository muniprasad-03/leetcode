// Last updated: 04/04/2026, 23:34:12
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(hm.get(ch)!=null) {
                hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }
        System.out.println(s);
        hm = hm.entrySet()
            .stream()
            .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));
        StringBuilder ans = new StringBuilder();
        for(Character ch : hm.keySet()) {
            int val = hm.get(ch);
            for(int i=0;i<val;i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
// Last updated: 04/04/2026, 23:27:50
class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()) freq.put(c,freq.getOrDefault(c,0)+1);
        Map<Integer,List<Character>> groups=new HashMap<>();
        for(var e:freq.entrySet()){
            groups.computeIfAbsent(e.getValue(),x->new ArrayList<>()).add(e.getKey());
        }
        int bSize=0,bFreq=0;
        List<Character> bGroup=new ArrayList<>();
        for(var e:groups.entrySet()){
            int f=e.getKey(),size=e.getValue().size();
            if(size>bSize||(size==bSize&&f>bFreq)){
                bSize=size;bFreq=f;bGroup=e.getValue();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:bGroup) sb.append(c);
        return sb.toString();
    }
}
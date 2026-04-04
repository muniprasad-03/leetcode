// Last updated: 04/04/2026, 23:26:28
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int n = bulbs.size();
        int[] freq = new int[101];
        for(int num : bulbs) {
            freq[num]++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=100;i++) {
            int f = freq[i];
            if(f > 0 && (f%2 == 1)) {
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
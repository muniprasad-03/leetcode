// Last updated: 04/04/2026, 23:31:28
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int p=0;
        for(int i=1;i<=n;i++) {
            if(target[p]==i) {
                ans.add("Push");
                p++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
            if(p==target.length)    break;
        }
        return ans;
    }
}
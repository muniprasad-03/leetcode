// Last updated: 04/04/2026, 23:27:40
class Solution {
    private String[] words;
    private int n;
    private boolean[] set;
    private List<List<String>> ans;
    private boolean isValid(List<String> list) {
        String top = list.get(0);
        String left = list.get(1);
        String right = list.get(2);
        String bottom = list.get(3);
        return  top.charAt(0) == left.charAt(0) && 
                top.charAt(3) == right.charAt(0) &&
                bottom.charAt(0) == left.charAt(3) && 
                bottom.charAt(3) == right.charAt(3);
    }
    private void help(int idx, List<String> curr) {
        if(curr.size()==4) {
            if(isValid(curr)) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        for(int i=0;i<n;i++) {
            if(!set[i]) {
                set[i] = true;
                curr.add(words[i]);
                help(i+1, curr);
                curr.remove(curr.size()-1);
                set[i] = false;
            }
        }
    }
    public List<List<String>> wordSquares(String[] words) {
        this.words = words;
        this.n = words.length;
        set = new boolean[n];
        Arrays.sort(words);
        ans = new ArrayList<>();
        help(0, new ArrayList<String>());
        ans.sort((a,b)-> {
            for(int i=0;i<4;i++) {
                int temp = a.get(i).compareTo(b.get(i));
                if(temp != 0) return temp;
            }
            return 0;
        });
        return ans;
    }
}
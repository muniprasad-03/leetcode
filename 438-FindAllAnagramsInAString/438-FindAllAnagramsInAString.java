// Last updated: 04/04/2026, 23:34:23
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr = new int[26];
        for(int i=0;i<p.length();i++) {
            arr[p.charAt(i)-'a'] += 1;
        }
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = 0;
        int[] temp = new int[26];
        while(right < s.length()) {
            temp[s.charAt(right)-'a'] += 1;
            if((right-left+1)==p.length()) {
                if(Arrays.equals(arr,temp)) {
                    ans.add(left);
                }
                temp[s.charAt(left)-'a'] -= 1;
                left++;
            }
            right++;
        }
        return ans;
    }
}
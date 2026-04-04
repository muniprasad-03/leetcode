// Last updated: 04/04/2026, 23:26:44
class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i=0;i<k/2;i++) {
            char temp = arr[i];
            arr[i] = arr[k-i-1];
            arr[k-i-1] = temp;
        }
        return new String(arr);
    }
}
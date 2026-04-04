// Last updated: 04/04/2026, 23:30:24
class Solution {
    private void reverse(char[] arr) {
        int l = 0, r = arr.length-1;
        while(l<r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }
    private long negative(long num) {
        char[] arr = Long.toString(num).toCharArray();
        if(arr.length == 1) return arr[0]-'0';
        Arrays.sort(arr);
        reverse(arr);
        return -1*Long.parseLong(new String(arr));
    }
    private long positive(long num) {
        char[] arr = Long.toString(num).toCharArray();
        if(arr.length == 1) return arr[0]-'0';
        Arrays.sort(arr);
        if(arr[0] != '0') return Long.parseLong(new String(arr));
        int i = 0;
        while(i<arr.length && arr[i] == '0') i++;
        char temp = arr[i];
        arr[i] = arr[0];
        arr[0] = temp;
        return Long.parseLong(new String(arr));
    }
    public long smallestNumber(long num) {
        return (num >= 0) ? positive(num) : negative(Math.abs(num));
    }
}
// Last updated: 11/05/2026, 21:32:49
1class Solution {
2    public int minimumSum(int num) {
3        char[] arr = String.valueOf(num).toCharArray();
4        Arrays.sort(arr);
5        int num1 = (arr[0]-'0')*10+(arr[2]-'0');
6        int num2 = (arr[1]-'0')*10+(arr[3]-'0');
7        return num1+num2;
8    }
9}
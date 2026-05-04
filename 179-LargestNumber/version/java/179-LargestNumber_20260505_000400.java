// Last updated: 05/05/2026, 00:04:00
class Solution {
 static int digits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    
    static long combine(int a, int b) {
        int d = digits(b);
        return (long) a * (long) Math.pow(10, d) + b;
    }

    public String largestNumber(int[] nums) {

        
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

       
        Arrays.sort(arr, (a, b) -> {
            long ab = combine(a, b);
            long ba = combine(b, a);
            return Long.compare(ba, ab); 
        });

       
        if (arr[0] == 0) return "0";

        
        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            result.append(num);
        }

        return result.toString();
    }
}
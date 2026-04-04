// Last updated: 04/04/2026, 23:34:27
class Solution {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>(n);
        for(int i = 1, fizz = 1, buzz = 1; i <= n; ++i, ++fizz, ++buzz) {
            if(fizz == 3 && buzz == 5) {
                ans.add(FIZZBUZZ);
                fizz = buzz = 0;
            }else if(fizz == 3) {
                ans.add(FIZZ);
                fizz = 0;
            }else if(buzz == 5) {
                ans.add(BUZZ);
                buzz = 0;
            }else{
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}

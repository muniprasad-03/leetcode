// Last updated: 04/04/2026, 23:39:04
public class Solution {
    public static String intToRoman(int num) {
        String[] romanList = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV", "I"};
        int[] numList = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder ans = new StringBuilder();
        int idx = 0;

        while (num != 0) {
            if (num < numList[idx]) {
                idx++;
            } else {
                num -= numList[idx];
                ans.append(romanList[idx]);
            }
        }
        return ans.toString();
    }
}

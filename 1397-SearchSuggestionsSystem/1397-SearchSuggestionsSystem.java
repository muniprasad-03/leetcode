// Last updated: 04/04/2026, 23:31:51
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();

        int left = 0, right = products.length - 1;

        for (int i = 0; i < searchWord.length(); i++) {
            char c = searchWord.charAt(i);

            // Narrow down left boundary
            while (left <= right && (products[left].length() <= i || products[left].charAt(i) != c)) {
                left++;
            }

            // Narrow down right boundary
            while (left <= right && (products[right].length() <= i || products[right].charAt(i) != c)) {
                right--;
            }

            List<String> temp = new ArrayList<>();

            for (int j = 0; j < 3 && left + j <= right; j++) {
                temp.add(products[left + j]);
            }

            result.add(temp);
        }

        return result;
    }
}
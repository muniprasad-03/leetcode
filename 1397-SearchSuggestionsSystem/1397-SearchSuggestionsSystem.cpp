// Last updated: 04/04/2026, 23:31:46
class Solution {
public:
    vector<vector<string>> suggestedProducts(vector<string>& products, string searchWord) {
        int m = products.size();
        int n = searchWord.size();

        sort(products.begin(), products.end());

        vector<vector<string>> ans(n);

        for (int i = 0; i < n; i++) {
            string sub = searchWord.substr(0, i + 1);

            int j = 0;
            while (j < m && products[j].find(sub) != 0) {
                j++;
            }
            int c = 0;
            while (c < 3 && j < m && products[j].find(sub) == 0) {
                ans[i].push_back(products[j]);
                c++;
                j++;
            }
        }

        return ans;
    }
};
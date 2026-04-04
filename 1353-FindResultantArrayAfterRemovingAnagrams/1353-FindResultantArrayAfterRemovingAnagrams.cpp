// Last updated: 04/04/2026, 23:31:50
class Solution {
public:
    vector<string> removeAnagrams(vector<string>& words) {
        vector<string> ans;
        string last="";
        for(string& word : words) {
            string temp = word;
            sort(temp.begin(),temp.end());
            if(temp!=last) {
                ans.push_back(word);
                last=temp;
            }
        }
        return ans;
    }
};
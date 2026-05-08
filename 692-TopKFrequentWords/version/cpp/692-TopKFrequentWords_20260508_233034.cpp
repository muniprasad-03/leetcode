// Last updated: 08/05/2026, 23:30:34
1class Solution {
2public:
3    vector<string> topKFrequent(vector<string>& words, int k) {
4        unordered_map<string, int> mp;
5        for(string &s : words) {
6            mp[s]++;
7        }
8        vector<string> keys;
9        for(auto &it : mp) {
10            keys.push_back(it.first);
11        }
12        sort(keys.begin(), keys.end(), [&](string &a, string &b) {
13            if(mp[a] == mp[b]) {
14                return a < b;
15            }
16            return mp[a] > mp[b];
17        });
18        return vector<string>(keys.begin(), keys.begin() + k);
19    }
20};
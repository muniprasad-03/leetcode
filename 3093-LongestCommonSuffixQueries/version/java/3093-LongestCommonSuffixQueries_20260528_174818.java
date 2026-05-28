// Last updated: 28/05/2026, 17:48:18
1class Trie {
2    Trie[] children;
3    boolean EOW;
4    int idx;
5    int len;
6
7    Trie() {
8        children = new Trie[26];
9        this.idx = -1;
10        this.len = Integer.MAX_VALUE;
11    }
12
13    void add(String word, int index) {
14        Trie curr = this;
15
16        if(word.length() < curr.len) {
17            curr.idx = index;
18            curr.len = word.length();
19        }
20
21        for(int i = word.length() - 1; i >= 0; i--) {
22            int idx = word.charAt(i) - 'a';
23            if(curr.children[idx] == null) {
24                curr.children[idx] = new Trie();
25            } 
26            curr = curr.children[idx];
27            
28            if(word.length() < curr.len) {
29                curr.idx = index;
30                curr.len = word.length();
31            }
32        }
33        curr.EOW = true;
34    }
35
36    int search(String word) {
37        Trie curr = this;
38        int n = word.length();
39        for(int i = word.length() - 1; i >= 0; i--) {
40            int idx = word.charAt(i) - 'a';
41            if(curr.children[idx] == null) return curr.idx;
42            curr = curr.children[idx];
43        }
44        return curr.idx;
45    }
46}
47
48class Solution {
49    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
50        Trie trie = new Trie();
51        for(int i = 0; i < wordsContainer.length; i++) {
52            trie.add(wordsContainer[i], i);
53        }
54
55        int[] ans = new int[wordsQuery.length];
56        for(int i = 0; i < wordsQuery.length; i++) {
57            ans[i] = trie.search(wordsQuery[i]);
58        }
59
60        return ans;
61    }
62}
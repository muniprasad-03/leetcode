// Last updated: 28/05/2026, 17:47:10
1class Trie {
2    Trie[] children;
3    boolean EOW;
4    int idx;
5    int len;
6    Trie() {
7        children = new Trie[26];
8        this.idx = -1;
9        this.len = Integer.MAX_VALUE;
10    }
11    void add(String word, int index) {
12        Trie curr = this;
13
14        if(word.length() < curr.len) {
15            curr.idx = index;
16            curr.len = word.length();
17        }
18
19        for(int i = word.length() - 1; i >= 0; i--) {
20            int idx = word.charAt(i) - 'a';
21            if(curr.children[idx] == null) {
22                curr.children[idx] = new Trie();
23            } 
24            curr = curr.children[idx];
25            if(word.length() < curr.len) {
26                curr.idx = index;
27                curr.len = word.length();
28            }
29        }
30        curr.EOW = true;
31    }
32
33    int search(String word) {
34        Trie curr = this;
35        int n = word.length();
36        for(int i = word.length() - 1; i >= 0; i--) {
37            int idx = word.charAt(i) - 'a';
38            if(curr.children[idx] == null) return curr.idx;
39            curr = curr.children[idx];
40        }
41        return curr.idx;
42    }
43}
44
45class Solution {
46    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
47        Trie trie = new Trie();
48        for(int i = 0; i < wordsContainer.length; i++) {
49            trie.add(wordsContainer[i], i);
50        }
51        int[] ans = new int[wordsQuery.length];
52        for(int i = 0; i < wordsQuery.length; i++) {
53            ans[i] = trie.search(wordsQuery[i]);
54        }
55        return ans;
56    }
57}
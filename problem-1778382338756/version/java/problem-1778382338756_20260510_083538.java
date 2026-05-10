// Last updated: 10/05/2026, 08:35:38
1class Solution{
2    public int[] countWordOccurrences(String[] chunks, String[] queries) {
3        HashMap<String, Integer> map=new HashMap<>();
4        StringBuilder sb=new StringBuilder();
5        for(String c:chunks) {
6            sb.append(c);
7        }
8        int n=sb.length();
9        int i=0;
10        while(i<n) {
11            if(!Character.isLetter(sb.charAt(i))) {
12                i++;
13                continue;
14            }
15            StringBuilder word=new StringBuilder();
16            while(i<n) {
17                char ch=sb.charAt(i);
18                if(Character.isLetter(ch)) {
19                    word.append(ch);
20                    i++;
21                }else if(ch=='-'&&i>0&&i<n-1&&Character.isLetter(sb.charAt(i-1))&&Character.isLetter(sb.charAt(i+1))) {
22                    word.append(ch);
23                    i++;
24                }else{
25                    break;
26                }
27            }
28            String key=word.toString();
29            if(!key.isEmpty()) {
30                map.put(key, map.getOrDefault(key, 0)+1);
31            }
32        }
33        int[] ans=new int[queries.length];
34        for(i=0;i<queries.length;i++) {
35            ans[i]=map.getOrDefault(queries[i], 0);
36        }
37        return ans;
38    }
39}
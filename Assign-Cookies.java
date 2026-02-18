1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int st = 0;
6        int end = 0;
7        int ans = 0;
8        while(st<g.length && end<s.length){
9            if(g[st]<=s[end]){
10                ans++;
11                st++;
12                end++;
13            }
14            else{
15                end++;
16            }
17        }
18        return ans;
19    }
20}
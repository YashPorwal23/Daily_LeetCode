1class Solution {
2    public int countMonobit(int n) {
3        int ans = 1;
4       for(int i=1;i<=n;i++){
5        String s = Integer.toBinaryString(i);
6        if(!s.contains("0")){
7            ans++;
8        }
9       }
10       return ans; 
11    }
12}
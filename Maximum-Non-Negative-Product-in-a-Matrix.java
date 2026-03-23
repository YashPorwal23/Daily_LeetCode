1class Solution {
2    public int maxProductPath(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        long maxdp[][] = new long[n][m];
6        long mindp[][] = new long[n][m];
7        maxdp[0][0] = grid[0][0];
8        mindp[0][0] = grid[0][0];
9        for(int i=1;i<m;i++){
10            maxdp[0][i] = grid[0][i]*maxdp[0][i-1];
11            mindp[0][i] = maxdp[0][i];
12        }
13        for(int i=1;i<n;i++){
14            maxdp[i][0] = grid[i][0]*maxdp[i-1][0];
15            mindp[i][0] = maxdp[i][0];
16        }
17        for(int i=1;i<n;i++){
18            for (int j=1;j<m;j++){
19                long val = grid[i][j];
20                long a = maxdp[i][j-1]*val;
21                long b = mindp[i][j-1]*val;
22                long c = maxdp[i-1][j]*val;
23                long d = mindp[i-1][j]*val;
24                maxdp[i][j] = Math.max(Math.max(a,b),Math.max(c,d));
25                mindp[i][j] = Math.min(Math.min(a,b),Math.min(c,d));
26            }
27        }
28        long ans = maxdp[n-1][m-1];
29        if (ans<0){
30            return -1;
31        }
32        return (int)(ans%1000000007);
33    }
34}
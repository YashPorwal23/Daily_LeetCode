1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        int arr[] = new int[n*m];
6        int idx=0;
7        long l[] = new long[n*m];
8        long r[] = new long[n*m];
9        for(int i=0;i<n;i++){
10            for(int j=0;j<m;j++){
11                arr[idx++]=grid[i][j];
12            }
13        }
14        long mul = 1;
15        for(int i=0;i<l.length;i++){
16            l[i]=mul;
17            mul=(mul*arr[i])%12345;
18        }
19        mul=1;
20        for(int i=r.length-1;i>=0;i--){
21            r[i]=mul;
22            mul=(mul*arr[i])%12345;
23        }
24        int ans[][] = new int[n][m];
25        idx=0;
26        for(int i=0;i<n;i++){
27            for(int j=0;j<m;j++){
28                ans[i][j] = (int)((l[idx]*r[idx])%12345);
29                idx++;
30            }
31        }
32        return ans;
33    }
34}
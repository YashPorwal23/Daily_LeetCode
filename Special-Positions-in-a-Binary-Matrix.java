1class Solution {
2    public int numSpecial(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int[] row = new int[m];
6        int[] col = new int[n];
7        for(int i=0;i<m;i++){
8            for(int j = 0; j < n; j++){
9                if(mat[i][j] == 1){
10                    row[i]++;
11                    col[j]++;
12                }
13            }
14        }
15        int count = 0;
16        for(int i = 0; i < m; i++){
17            for(int j = 0; j < n; j++){
18                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){
19                    count++;
20                }
21            }
22        }
23    return count;
24    }
25}
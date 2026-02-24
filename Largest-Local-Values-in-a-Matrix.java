1class Solution {
2    public int[][] largestLocal(int[][] grid) {
3
4        int n = grid.length;
5
6        // result matrix
7        int[][] ans = new int[n - 2][n - 2];
8
9        // starting point of every 3x3 matrix
10        for (int i = 0; i < n - 2; i++) {
11
12            for (int j = 0; j < n - 2; j++) {
13
14                int max = 0;
15
16                // check 3x3 block
17                for (int r = i; r < i + 3; r++) {
18                    for (int c = j; c < j + 3; c++) {
19
20                        max = Math.max(max, grid[r][c]);
21                    }
22                }
23
24                ans[i][j] = max;
25            }
26        }
27        return ans;
28    }
29}
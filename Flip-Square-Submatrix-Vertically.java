1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        int idx = x+k-1;
4        for(int i=x;i<x+k;i++){
5            for(int j=y;j<y+k;j++){
6                if(i<idx){
7                int temp = grid[i][j];
8                grid[i][j]=grid[idx][j];
9                grid[idx][j]=temp;
10                }
11            }
12            idx--;
13        }
14        return grid;
15    }
16}
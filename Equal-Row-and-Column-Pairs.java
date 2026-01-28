1class Solution {
2    public int equalPairs(int[][] grid) {
3        int ans=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid.length;j++){
6            boolean chk = true;
7                for(int k=0;k<grid.length;k++){
8                    if(grid[i][k]!=grid[k][j]){
9                        chk=false;
10                        break;
11                    }
12                }
13            if(chk){
14                ans++;
15            }
16          }
17        }
18        return ans;
19    }
20}
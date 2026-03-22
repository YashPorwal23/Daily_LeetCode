1class Solution {
2    public int countSubmatrices(int[][] grid, int k) {
3        int arr[][] = new int[grid.length][grid[0].length];
4        arr[0][0]=grid[0][0];
5        for(int i=1;i<grid[0].length;i++){
6            arr[0][i]=arr[0][i-1]+grid[0][i];
7        }
8        for(int i=1;i<arr.length;i++){
9            arr[i][0]=arr[i-1][0]+grid[i][0];
10        }
11        for(int i=1;i<arr.length;i++){
12            for(int j=1;j<arr[0].length;j++){
13                arr[i][j]=arr[i-1][j]+arr[i][j-1]+grid[i][j]-arr[i-1][j-1];
14            }
15        }
16        int ans = 0;
17        for(int i=0;i<arr.length;i++){
18            for(int j=0;j<arr[0].length;j++){
19                if(arr[i][j]<=k){
20                    ans++;
21                }
22            }
23        }
24        return ans;
25    }
26}
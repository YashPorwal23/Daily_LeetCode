1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        int arr[] = new int[grid.length*grid[0].length];
4        int c=0;
5        for(int i=0;i<grid.length;i++){
6            for(int j=0;j<grid[0].length;j++){
7                arr[c++]=grid[i][j];
8            }
9        }
10        Arrays.sort(arr);
11        int n= arr.length;
12        int val= arr[n/2];
13        c=0;
14        for(int i=0;i<arr.length-1;i++){
15            if(arr[i]%x!=arr[i+1]%x){
16                return -1;
17            }
18        }
19        for(int i=0;i<arr.length;i++){
20            c=c+(Math.abs(arr[i]-val)/x);
21        }
22        return c;
23    }
24}
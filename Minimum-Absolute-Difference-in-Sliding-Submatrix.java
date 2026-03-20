1class Solution {
2    public int[][] minAbsDiff(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int ans[][] = new int[m-k+1][n-k+1];
6        for(int i=0;i<ans.length;i++){
7            for(int j=0;j<ans[0].length;j++){
8                ArrayList<Integer> al = new ArrayList<>();
9                for(int r=i;r<i+k;r++){
10                    for(int c=j;c<j+k;c++){
11                        al.add(grid[r][c]);
12                    }
13                }
14                Collections.sort(al);
15                int min = Integer.MAX_VALUE;
16                for(int x=1;x<al.size();x++){
17                    if(!al.get(x).equals(al.get(x-1))){
18                    min=Math.min(min,al.get(x)-al.get(x-1));
19                    }
20                }
21                if(min==Integer.MAX_VALUE){
22                    ans[i][j]=0;
23                }
24                else{
25                    ans[i][j]=min;
26                }
27            }
28        }
29        return ans;
30    }
31}
32
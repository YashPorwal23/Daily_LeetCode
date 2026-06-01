1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int c = 0;
5        int sum = 0;
6        for(int i=cost.length-1;i>=0;i--){
7            if(c<2){
8                sum+=cost[i];
9                c++;
10            }
11            else{
12                c=0;
13            }
14        }
15        return sum;
16    }
17}
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int ans = 0;
5        for(int i=0;i<costs.length;i++){
6            if(costs[i]<=coins){
7                coins-=costs[i];
8                ans++;
9            }
10            else{
11                return ans;
12            }
13        }
14        return ans;
15    }
16}
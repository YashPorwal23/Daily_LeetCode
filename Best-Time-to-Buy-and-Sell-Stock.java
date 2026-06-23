1class Solution {
2    public int maxProfit(int[] prices) {
3        int min = prices[0];
4        int ans = 0;
5        for(int i=1;i<prices.length;i++){
6            if(prices[i]>min){
7                ans = Math.max(ans,prices[i]-min);
8            }
9            else{
10                min = prices[i];
11            }
12        }
13        return ans;
14    }
15}
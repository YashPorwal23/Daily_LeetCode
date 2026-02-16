1class Solution {
2    public long rob(int[] nums, int[] colors) {
3        if(nums.length==1){
4            return (long)nums[0];
5        }
6        long dp[] = new long[nums.length];
7        dp[0]= (long)nums[0];
8        if(colors[0]!=colors[1]){
9            dp[1]=dp[0]+(long)nums[1];
10        }
11        else{
12            dp[1]=Math.max(dp[0],(long)nums[1]);
13        }
14        for(int i=2;i<colors.length;i++){
15            if(colors[i]!=colors[i-1]){
16                dp[i]=dp[i-1]+(long)nums[i]; 
17            }
18            else{
19                dp[i]=Math.max((long)nums[i]+dp[i-2],dp[i-1]);
20            }
21        }
22        return dp[dp.length-1];
23    }
24}
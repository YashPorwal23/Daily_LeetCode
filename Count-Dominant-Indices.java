1class Solution {
2    public int dominantIndices(int[] nums) {
3      int sum = 0;
4      for(int i=0;i<nums.length;i++){
5        sum+=nums[i];
6      }
7      int ans = 0;
8      for(int i=0;i<nums.length-1;i++){
9        sum-=nums[i];
10        double avg = sum/(nums.length-1-i);
11        if(nums[i]>avg){
12            ans++;
13        }
14      }
15      return ans;  
16    }
17}
1class Solution {
2    public long[] findPrefixScore(int[] nums) {
3        long ans[] = new long[nums.length];
4        long sum = 0;
5        int max = Integer.MIN_VALUE;
6        for(int i=0;i<nums.length;i++){
7            max=Math.max(max,nums[i]);
8            sum+=nums[i]+max;
9            ans[i]=sum;
10        }
11        return ans;
12    }
13}
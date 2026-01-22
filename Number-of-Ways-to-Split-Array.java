1class Solution {
2    public int waysToSplitArray(int[] nums) {
3        long sum=0;
4        for(int x:nums){
5            sum+=x;
6        }
7        long lsum = 0;
8        long rsum = 0;
9        int ans=0;
10        for(int i=0;i<nums.length-1;i++){
11            lsum+=nums[i];
12            rsum=sum-lsum;
13            if(lsum>=rsum){
14                ans++;
15            }
16        }
17        return ans;
18    }
19}
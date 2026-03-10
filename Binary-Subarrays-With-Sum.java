1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        return count(nums,goal)-count(nums,goal-1);
4    }
5    public int count(int nums[],int target){
6        if(target<0)return 0;
7        int l=0;
8        int curr=0;
9        int c=0;
10        for(int i=0;i<nums.length;i++){
11            curr+=nums[i];
12            while(curr>target){
13                curr-=nums[l++];
14            }
15            c=c+(i-l+1);
16        }
17        return c;
18    }
19}
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int ans[] = new int[nums.length];
4        int n = nums.length;
5        for(int i=0;i<n;i++){
6            if(nums[i]==0){
7                ans[i]=nums[i];
8            }
9            else if(nums[i]>0){
10            ans[i]=nums[(nums[i]+i)%n];
11            }
12            else{
13                int val = Math.abs(nums[i]);
14                val=val%n;
15                if(i-val>=0){
16                    ans[i]= nums[i-val];
17                }
18                else{
19                    int dis1 = val-i;
20                    int dis2 = (n-dis1)%n;
21                    ans[i]=nums[dis2]; 
22                }
23            }
24        } 
25         return ans;
26    }
27}
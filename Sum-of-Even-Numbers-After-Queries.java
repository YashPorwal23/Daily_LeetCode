1class Solution {
2    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
3        int ans[] = new int[queries.length];
4        int sum = 0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]%2==0){
7                sum+=nums[i];
8            }
9        }
10        for(int i=0;i<queries.length;i++){
11            int val = queries[i][0];
12            int idx = queries[i][1];
13            if((nums[idx]+val)%2==0){
14                if(nums[idx]%2==0){
15                    sum-=nums[idx];
16                }
17                nums[idx]+=val;
18                sum+=nums[idx];
19            }
20            else{
21                if(nums[idx]%2==0){
22                    sum-=nums[idx];
23                }
24                nums[idx]+=val;
25            }
26            ans[i]=sum;
27        }
28        return ans;
29    }
30}
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        long ans=0;
4        long c=0;
5     for(int i=0;i<nums.length;i++){
6        if(nums[i]==0){
7            c++;
8        }
9        else{
10            ans=ans+(c*(c+1))/2;
11            c=0;
12        }
13     }
14     if(c!=0){
15        ans=ans+(c*(c+1))/2;
16     }
17     return ans;   
18    }
19}
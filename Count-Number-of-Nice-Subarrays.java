1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        for(int i=0;i<nums.length;i++){
4            if(nums[i]%2!=0){
5                nums[i]=1;
6            }
7            else{
8                nums[i]=0;
9            }
10        }
11        return count(nums,k)-count(nums,k-1);
12    }
13    public int count(int nums[],int target){
14        if(target<0)return 0;
15        int l=0;
16        int curr=0;
17        int c=0;
18        for(int i=0;i<nums.length;i++){
19            curr+=nums[i];
20            while(curr>target){
21                curr-=nums[l++];
22            }
23            c=c+(i-l+1);
24        }
25        return c;
26    }
27}
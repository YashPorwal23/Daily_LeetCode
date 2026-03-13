1class Solution {
2    public int longestOnes(int[] nums, int k) {
3       int ans = 0;
4       int c = 0;
5       int left=0;
6       for(int i=0;i<nums.length;i++){
7        if(nums[i]==0){
8            c++;
9        }
10        while(c>k){
11            if(nums[left]==0){
12                c--;
13            }
14            left++;
15        }
16        ans=Math.max(ans,i-left+1);
17       }
18       return ans; 
19    }
20}
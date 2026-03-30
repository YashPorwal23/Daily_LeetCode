1class Solution {
2    public int minAbsoluteDifference(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if((nums[i]==1&&nums[j]==2)||nums[i]==2 && nums[j]==1){
7                    ans = Math.min(ans,j-i);
8                }
9            }
10        }
11        if(ans==Integer.MAX_VALUE) return -1;
12        return ans;
13    }
14}
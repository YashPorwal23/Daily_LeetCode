1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        for(int i=nums.length-1;i>0;i--){
4            if(nums[i]<=nums[i-1]){
5                return i;
6            }
7        }
8        return 0;
9    }
10}
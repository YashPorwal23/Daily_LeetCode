1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int i=0;
5        int j=nums.length-1;
6        int max=Integer.MIN_VALUE;
7        while(i<j){
8            max=Math.max(max,(nums[i]+nums[j]));
9            i++;
10            j--;
11        }
12        return max;
13    }
14}
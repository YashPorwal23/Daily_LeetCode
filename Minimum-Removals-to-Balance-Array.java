1class Solution {
2    public int minRemoval(int[] nums, int k) {
3       Arrays.sort(nums);
4       int i=0;
5       int j=0;
6       int ans=Integer.MAX_VALUE;
7       while(i<nums.length && j<nums.length){
8        if((long)nums[i]*k>=nums[j]){
9            j++;
10        }
11        else{
12            ans=Math.min(ans,nums.length-(j-i));
13            i++;
14        }
15       }
16        return Math.min(ans,nums.length-(j-i));
17    }
18}
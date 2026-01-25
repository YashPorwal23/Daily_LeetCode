1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        if(k==1){
4            return 0;
5        }
6        Arrays.sort(nums);
7        int ans = Integer.MAX_VALUE;
8        int j = k-1;
9        for(int i=0;i<nums.length;i++){
10            if(j<nums.length){
11            ans=Math.min(ans,nums[j]-nums[i]);
12            j++;
13            }
14        }
15        return ans;
16    }
17}
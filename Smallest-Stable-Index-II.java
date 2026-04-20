1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int max[] = new int[nums.length];
4        int min[] = new int[nums.length];
5        max[0]=nums[0];
6        for(int i=1;i<nums.length;i++){
7            max[i]=Math.max(nums[i],max[i-1]);
8        }
9        min[min.length-1]=nums[nums.length-1];
10        for(int i=nums.length-2;i>=0;i--){
11            min[i]=Math.min(nums[i],min[i+1]);
12        }
13        for(int i=0;i<max.length;i++){
14            if(max[i]-min[i]<=k){
15                return i;
16            }
17        }
18        return -1;
19    }
20}
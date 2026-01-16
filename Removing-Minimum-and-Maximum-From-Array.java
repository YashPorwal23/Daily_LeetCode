1class Solution {
2    public int minimumDeletions(int[] nums) {
3        if(nums.length==1){
4            return 1;
5        }
6        int min=Integer.MAX_VALUE;
7        int max=Integer.MIN_VALUE;
8        int minIdx =-1;
9        int maxIdx =-1;
10        for(int i=0;i<nums.length;i++){
11            if(min>nums[i]){
12                min=nums[i];
13                minIdx=i;
14            }
15            if(max<nums[i]){
16                max=nums[i];
17                maxIdx=i;
18            }
19        }
20        int leftIdx = Math.min(minIdx,maxIdx);
21        int rightIdx = Math.max(minIdx,maxIdx);
22        int left=rightIdx+1;
23        int right=nums.length-leftIdx;
24        int both = (leftIdx+1)+(nums.length-rightIdx);
25        return Math.min(left,Math.min(right,both));
26    }
27}
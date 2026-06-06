1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int left[] = new int[nums.length];
4        int right[] = new int[nums.length];
5        left[0]=0;
6        right[nums.length-1]=0;
7        for(int i=1;i<left.length;i++){
8            left[i]=left[i-1]+nums[i-1];
9        }
10        for(int i=right.length-2;i>=0;i--){
11            right[i]=right[i+1]+nums[i+1];
12        }
13        for(int i=0;i<left.length;i++){
14            left[i]=Math.abs(left[i]-right[i]);
15        }
16        return left;
17    }
18}
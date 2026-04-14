1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int ans = 0;
4        for(int i=0;i<nums.length;i++){
5            int val = nums[i];
6            while(val!=0){
7                int r = val%10;
8                if(r==digit){
9                    ans++;
10                }
11                val/=10;
12            }
13        }
14        return ans;
15    }
16}
1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int ans = 0;
4        for(int i=0;i<nums.length;i++){
5            int count = 0;
6            for(int j=i;j<nums.length;j++){
7                if(nums[j] == target){
8                    count++;
9                }
10            if((count)>((j-i+1)/2)){
11                ans++;
12            }
13            }
14        }
15        return ans;
16    }
17}
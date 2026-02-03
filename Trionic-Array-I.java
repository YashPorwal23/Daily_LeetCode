1class Solution {
2    public boolean isTrionic(int[] nums) {
3        int p = 0;
4        int q = 0;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]>=nums[i+1]){
7                p=i;
8                break;
9            }
10        }
11        if(p==0||p==nums.length-1){
12            return false;
13        }
14        for(int i=p;i<nums.length-1;i++){
15            if(nums[i]<=nums[i+1]){
16                q=i;
17                break;
18            }
19        }
20        if(q==0||q==nums.length-1){
21            return false;
22        }
23        for(int i=q;i<nums.length-1;i++){
24            if(nums[i]>=nums[i+1]){
25                return false;
26            }
27        }
28        return true;
29    }
30}
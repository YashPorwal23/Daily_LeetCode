1class Solution {
2    public int maxArea(int[] height) {
3        int st=0;
4        int end=height.length-1;
5        int ans=0;
6        while(st<=end){
7            if(height[st]<=height[end]){
8                if(ans<height[st]*(end-st)){
9                ans=height[st]*(end-st);
10                }
11                st++;
12            }
13            else{
14                if(ans<height[end]*(end-st)){
15                 ans=height[end]*(end-st);
16                }
17                 end--;
18            }
19        }
20         return ans;
21    }
22}
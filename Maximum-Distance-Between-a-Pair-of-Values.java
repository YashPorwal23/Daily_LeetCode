1class Solution {
2    public int maxDistance(int[] nums1, int[] nums2) {
3        int i = nums1.length-1;
4        int j = nums2.length-1;
5        int ans = 0;
6        while(i>=0 && j>=0){
7            if(nums1[i]<=nums2[j]){
8                ans=Math.max(ans,j-i);
9                i--;
10            }
11            else{
12                j--;
13            }
14        }
15        return ans;
16    }
17}
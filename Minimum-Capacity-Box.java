1class Solution {
2    public int minimumIndex(int[] capacity, int itemsize) {
3        int ans = -1;
4        int min = Integer.MAX_VALUE;
5        for(int i=0;i<capacity.length;i++){
6            if(capacity[i]-itemsize==0){
7                return i;
8            }
9            else if(capacity[i]>itemsize && capacity[i]-itemsize<min){
10                min = capacity[i]-itemsize;
11                ans=i;
12            }
13        }
14        return ans;
15    }
16}
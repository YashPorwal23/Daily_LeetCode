1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int ans=0;
4        for(int i=0;i<points.length-1;i++){
5            int p1=points[i][0];
6            int p2=points[i][1];
7            int p3=points[i+1][0];
8            int p4=points[i+1][1];
9            ans=ans+Math.max(Math.abs((p3-p1)),Math.abs((p4-p2)));
10        }
11        return ans;
12    }
13}
1class Solution {
2    public boolean carPooling(int[][] trips, int capacity) {
3     int max = Integer.MIN_VALUE;
4     for(int i=0;i<trips.length;i++){
5        max=Math.max(max,trips[i][2]);
6     }
7     int arr[] = new int[max+1];
8     for(int i=0;i<trips.length;i++){
9        int st  = trips[i][1];
10        int end = trips[i][2];
11        int val = trips[i][0];
12        arr[st]+=val;
13        arr[end]-=val;
14     }
15     int curr=0;
16     for(int i=0;i<arr.length;i++){
17        curr+=arr[i];
18        if(curr>capacity){
19            return false;
20        }
21     }
22     return true;    
23    }
24}
1class Solution {
2    public int[] corpFlightBookings(int[][] bookings, int n) {
3        int arr[] = new int[n];
4        for(int i=0;i<bookings.length;i++){
5            int x=bookings[i][0]-1;
6            int y=bookings[i][1]-1;
7            int val = bookings[i][2];
8            for(int j=x;j<=y;j++){
9                arr[j]=arr[j]+val;
10            }
11        }
12        return arr;
13    }
14}
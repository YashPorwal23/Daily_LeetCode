1class Solution {
2    public int mirrorDistance(int n) {
3        int temp=n;
4        int rev=0;
5        while(temp!=0){
6            rev=rev*10+(temp%10);
7            temp/=10;
8        }
9        return Math.abs(n-rev);
10    }
11}
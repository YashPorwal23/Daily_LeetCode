1class Solution {
2    public int minCost(int n) {
3       int c = 0;
4       while(n>1){
5        n=1*n-1;
6        c+=n; 
7       } 
8       return c;
9    }
10}
1class Solution {
2    public boolean validDigit(int n, int x) {
3        int c = 0;
4        int rev = 0;
5        while(n!=0){
6            int p = n%10;
7            if(p==x){
8                c++;
9            }
10            rev=rev*10+p;
11            n/=10;
12        }
13        if((rev%10)!=x && c>0) return true;
14        return false;
15    }
16}
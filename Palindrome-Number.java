1class Solution {
2    public boolean isPalindrome(int x) {
3        int rev=0;
4        int temp=x;
5        while(x>0){
6            int p=x%10;
7            rev=rev*10+p;
8            x=x/10;
9        }
10        if(rev==temp){
11            return true;
12        }
13        return false;
14
15    }
16}
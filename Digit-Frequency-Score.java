1class Solution {
2    public int digitFrequencyScore(int n) {
3        int ans = 0;
4        while(n!=0){
5            ans=ans+(n%10);
6            n/=10;
7        }
8        return ans;
9    }
10}
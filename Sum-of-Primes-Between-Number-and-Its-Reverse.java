1class Solution {
2    public int sumOfPrimesInRange(int n) {
3        int temp = n;
4        int rev = 0;
5        while(temp!=0){
6            rev = rev*10+(temp%10);
7            temp/=10;
8        }
9        int ans = 0;
10        int min = Math.min(n,rev);
11        int max = Math.max(n,rev);
12        for(int i=min;i<=max;i++){
13            if(isPrime(i)){
14                ans+=i;
15            }
16        }
17        return ans;
18    }
19    public boolean isPrime(int x){
20        if(x<2) return false;
21        for(int i=2;i<=Math.sqrt(x);i++){
22            if(x%i==0) return false;
23        }
24        return true;
25    }
26}
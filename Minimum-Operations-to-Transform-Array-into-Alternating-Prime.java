1class Solution {
2    public int minOperations(int[] nums) {
3        int ans = 0;
4        for(int i=0;i<nums.length;i+=2){
5            if(!isPrime(nums[i])){
6                ans=ans+(closest(nums[i])-nums[i]);
7            }
8        }
9        for(int i=1;i<nums.length;i+=2){
10            if(isPrime(nums[i])){
11                if(nums[i]==2){
12                    ans+=2;
13                }
14                else{
15                    ans++;
16                }
17            }
18        }
19        return ans;
20    }
21    public boolean isPrime(int x){
22        if(x<2) return false;
23        for(int i=2;i<=Math.sqrt(x);i++){
24            if(x%i==0){
25                return false;
26            }
27        }
28        return true;
29    }
30    public int closest(int val){
31        int x = val+1;
32        while(true){
33            if(isPrime(x)) return x;
34            x++;
35        }
36    }
37}
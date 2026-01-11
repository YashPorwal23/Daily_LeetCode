1class Solution {
2    public int distinctPrimeFactors(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            int c=2;
6            while(nums[i]!=1){
7                if(isPrime(c) && nums[i]%c==0){
8                    nums[i]=nums[i]/c;
9                    set.add(c);
10                }
11                else{
12                    c++;
13                }
14            }
15        }
16        return set.size();
17    }
18    public boolean isPrime(int x){
19        if(x<2) return false;
20        for(int i=2;i<=Math.sqrt(x);i++){
21            if(x%i==0){
22                return false;
23            }
24        }
25        return true;
26    }
27}
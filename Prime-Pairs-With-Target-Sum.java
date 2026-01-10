1class Solution {
2    public List<List<Integer>> findPrimePairs(int n) {
3        List<List<Integer>> ans= new ArrayList<>();
4        for(int i=1;i<=n/2;i++){
5            ArrayList<Integer> al = new ArrayList<>();
6            if(isPrime(i)){
7                if(isPrime(n-i)){
8                    al.add(i);
9                    al.add(n-i);
10                    ans.add(al);
11                }
12            }
13        }
14        return ans;
15    }
16    static boolean isPrime(int n) {
17        if (n <= 1) return false;
18        if (n <= 3) return true;
19        if (n % 2 == 0 || n % 3 == 0) return false;
20        for (int i = 5; i * i <= n; i += 6) {
21            if (n % i == 0 || n % (i + 2) == 0)
22                return false;
23        }
24        return true;
25    }
26}
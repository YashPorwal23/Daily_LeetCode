1class Solution {
2    public int maxCount(int[] banned, int n, int maxSum) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int x:banned){
5            set.add(x);
6        }
7        int sum = 0;
8        int ans=0;
9        for(int i=1;i<=n;i++){
10            if(!set.contains(i)){
11                if((sum+i)>maxSum){
12                    return ans;
13                }
14                sum+=i;
15                ans++;
16            }
17        }
18        return ans;
19    }
20}
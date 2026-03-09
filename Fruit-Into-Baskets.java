1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4        int j = 0;
5        int ans = 0;
6        for(int i=0;i<fruits.length;i++){
7            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);
8            while(mp.size()>2){
9                if(mp.get(fruits[j])==1){
10                    mp.remove(fruits[j]);
11                }
12                else{
13                    mp.put(fruits[j],mp.get(fruits[j])-1);
14                }
15                j++;
16            }
17            ans=Math.max(ans,i-j+1);
18        }
19        return ans;
20    }
21}
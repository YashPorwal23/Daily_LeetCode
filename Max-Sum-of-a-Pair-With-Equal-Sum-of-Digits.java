1class Solution {
2    public int maximumSum(int[] nums) {
3      HashMap<Integer,Integer> mp = new HashMap<>();
4      int ans=-1;
5      for(int i=0;i<nums.length;i++){
6        int s = sum(nums[i]);
7        if(!mp.containsKey(s)){
8            mp.put(s,nums[i]);
9        }
10        else{
11            ans=Math.max(ans,mp.get(s)+nums[i]);
12            mp.put(s,Math.max(mp.get(s),nums[i]));
13        }
14      }
15      return ans;
16    }
17    public int sum(int x){
18        int temp = 0;
19        while(x!=0){
20            temp=temp+(x%10);
21            x/=10;
22        }
23        return temp;
24    }
25}
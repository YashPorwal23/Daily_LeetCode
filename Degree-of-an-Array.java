1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4        HashMap<Integer,Integer> mp1 = new HashMap<>();
5        HashMap<Integer,Integer> mp2 = new HashMap<>();
6        for(int i=0;i<nums.length;i++){
7            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
8        }
9        int freq = Integer.MIN_VALUE;
10        for(var e:mp.entrySet()){
11            freq=Math.max(freq,e.getValue());
12        }
13        for(int i=0;i<nums.length;i++){
14            if(!mp1.containsKey(nums[i])){
15            mp1.put(nums[i],i);
16            }
17        }
18        for(int i=0;i<nums.length;i++){
19                mp2.put(nums[i],i);
20        }
21        int ans=Integer.MAX_VALUE;
22        for(int i=nums.length-1;i>=0;i--){
23            if(mp.get(nums[i])==freq){
24                int val = mp2.get(nums[i])-mp1.get(nums[i])+1;
25                ans=Math.min(ans,val);
26            }
27        }
28        return ans;
29    }
30}
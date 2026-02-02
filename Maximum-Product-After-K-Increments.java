1class Solution {
2    public int maximumProduct(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for(int i=0;i<nums.length;i++){
5            pq.add(nums[i]);
6        }
7        while(k!=0){
8            int x = pq.poll();
9            pq.add(x+1);
10            k--;
11        }
12        int mod = 1000000007;
13        long ans =1;
14        while(!pq.isEmpty()){
15            ans=(ans*pq.poll())%mod;
16        }
17        return (int)ans; 
18    }
19}
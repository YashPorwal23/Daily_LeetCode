1class Solution {
2    public int minMirrorPairDistance(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        HashMap<Integer,Integer> mp = new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            if(mp.containsKey(nums[i])){
7                ans = Math.min(ans,Math.abs(i-mp.get(nums[i])));
8            }
9            mp.put(rev(nums[i]),i);
10        }
11        if(ans==Integer.MAX_VALUE) return -1;
12        return ans;
13    }
14    public int rev(int x){
15        int rev = 0;
16        while(x!=0){
17            int p = x%10;
18            rev=rev*10+p;
19            x/=10;
20        }
21        return rev;
22    }
23}
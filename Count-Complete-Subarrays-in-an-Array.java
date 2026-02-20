1class Solution {
2    public int countCompleteSubarrays(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int x:nums){
5            set.add(x);
6        }
7        int ans = 0;
8        int val = set.size();
9        for(int i=0;i<nums.length;i++){
10            HashSet<Integer> set1 = new HashSet<>();
11            for(int j=i;j<nums.length;j++){
12                set1.add(nums[j]);
13                if(set1.size()==val){
14                    ans++;
15                }
16            }
17        }
18        return ans;
19    }
20}
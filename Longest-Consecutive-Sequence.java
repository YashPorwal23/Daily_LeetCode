1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            set.add(nums[i]);
6        }
7        int ans = 0;
8        for(int x:set){
9            if(!set.contains(x-1)){
10                int val=x;
11                int c=1;
12                while(set.contains(val+1)){
13                    c++;
14                    val++;
15                }
16                ans=Math.max(c,ans);
17            }
18        }
19        return ans;
20    }
21}
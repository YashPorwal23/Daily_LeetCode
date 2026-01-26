1class Solution {
2    public int[] arrayChange(int[] nums, int[][] operations) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            mp.put(nums[i],i);
6        }
7        for(int i=0;i<operations.length;i++){
8            int idx = mp.get(operations[i][0]);
9            mp.remove(operations[i][0]);
10            nums[idx]=operations[i][1];
11            mp.put(nums[idx],idx);
12        }
13        return nums;
14    }
15}
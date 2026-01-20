1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=target[i]){
6                set.add(nums[i]);
7            }
8        }
9        return set.size();   
10    }
11}
1class Solution {
2    public int subsetXORSum(int[] nums) {
3        int or = 0;
4        for (int num : nums) {
5            or |= num;
6        }
7        return or * (1 << (nums.length - 1));
8
9    }
10}
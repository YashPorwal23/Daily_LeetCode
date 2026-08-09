class Solution {
    public int[] sortedSquares(int[] nums) {
        int st = 0;
        int end = nums.length-1;
        int idx = nums.length-1;
        int ans[] = new int[nums.length];
        while(st<=end){
            int val = nums[st]*nums[st];
            int val2 = nums[end]*nums[end];
            if(val>val2){
                ans[idx--] = val;
                st++;
            }
            else{
                ans[idx--] = val2;
                end--;
            }
        }
        return ans;
    }
}
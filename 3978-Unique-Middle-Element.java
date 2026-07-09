class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int c = 0;
        int val = nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                c++;
            }
        }
        return c==1;
    }
}
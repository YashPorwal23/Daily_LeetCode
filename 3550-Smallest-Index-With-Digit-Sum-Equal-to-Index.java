class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(digitsum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
        public static int digitsum(int n){
            int sum=0;
            while(n!=0){
                int p = n%10;
                sum+=p;
                n/=10;
            }
            return sum;
    }
}
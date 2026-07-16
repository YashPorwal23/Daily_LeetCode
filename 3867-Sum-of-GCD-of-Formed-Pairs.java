class Solution {
    public long gcdSum(int[] nums) {
        int pre[] = new int[nums.length];
        pre[0]=nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            pre[i]=gcd(nums[i],max);
        }
        Arrays.sort(pre);
        int st = 0;
        int end = pre.length-1;
        long ans = 0;
        while(st<end){
            ans=ans+(gcd(pre[st],pre[end]));
            st++;
            end--;
        }
        return ans;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
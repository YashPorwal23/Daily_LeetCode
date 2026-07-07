class Solution {
    public long sumAndMultiply(int n) {
        long val = rev(n);
        long sum = 0;
        long curr = rev(val);
        while(val!=0){
            sum+=(val%10);
            val/=10;
        }
        return curr*sum;
    }
    public long rev(long x){
        long rev = 0;
        while(x!=0){
            if(x%10!=0){
                rev=rev*10+(x%10);
            }
            x/=10;
        }
        return rev;
    }
}
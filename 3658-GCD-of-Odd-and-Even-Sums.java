class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even = 0;
        int odd  = 0;
        int x =  n*2;
        int val = 1;
        while(x!=0){
            if(val%2==0){
                even+=val;
            }
            else{
                odd+=val;
            }
            val++;
            x--;
        }
        return gcd(even,odd);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b= a%b;
            a = temp;
        }
        return a;
    }
}
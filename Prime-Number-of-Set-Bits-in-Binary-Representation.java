1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int ans=0;
4        for(int i=left;i<=right;i++){
5            int val = Integer.bitCount(i);
6            if(val==2||val==3||val==5||val==7||val==11||val==13||val==17||val==19){
7                ans++;
8            }
9        }
10        return ans;
11    }
12}
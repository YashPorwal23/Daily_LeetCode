1class Solution {
2    public int maxCoins(int[] piles) {
3       Arrays.sort(piles);
4       int st = 0;
5       int end = piles.length-2;
6       int sum=0;
7       while(st<end){
8        sum+=piles[end];
9        end-=2;
10        st++;
11       }
12       return sum; 
13    }
14}
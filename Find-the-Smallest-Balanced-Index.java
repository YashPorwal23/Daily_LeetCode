1class Solution {
2    public int smallestBalancedIndex(int[] nums) {
3        long sum[] = new long[nums.length];
4        long prod[] = new long[nums.length];
5        sum[0]=0;
6        prod[prod.length-1]=1;
7        for(int i=1;i<sum.length;i++){
8            sum[i]=sum[i-1]+nums[i-1];
9        }
10        for(int i=prod.length-2;i>=0;i--){
11            if(prod[i+1] > Long.MAX_VALUE / nums[i+1]){
12                prod[i] = Long.MAX_VALUE;
13            }
14            else{
15            prod[i]=prod[i+1]*nums[i+1];
16            }
17        }
18        for(int i=0;i<sum.length;i++){
19            if(sum[i]==prod[i]){
20                return i;
21            }
22        }
23        return -1;
24    }
25}
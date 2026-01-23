1class Solution {
2    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
3        int diff[] = new int[capacity.length];
4        int c=0;
5        for(int i=0;i<capacity.length;i++){
6            diff[i]=capacity[i]-rocks[i];
7        }
8        Arrays.sort(diff);
9        for(int i=0;i<diff.length;i++){
10            if(diff[i]==0){
11                c++;
12            }
13            else{
14                if(diff[i]<=additionalRocks){
15                    c++;
16                    additionalRocks-=diff[i];
17                }
18            }
19        }
20        return c;
21    }
22}
1class Solution {
2    public int hIndex(int[] arr) {
3        if(arr.length==1){
4            if(arr[0]>=1){
5                return 1;
6            }
7            return 0;
8        }
9       Arrays.sort(arr);
10        int paper = 1;
11        for(int i=arr.length-1;i>=0;i--){
12            if(arr[i]<paper){
13                return paper-1;
14            }
15            paper++;
16        }
17        return paper-1;
18    }
19}
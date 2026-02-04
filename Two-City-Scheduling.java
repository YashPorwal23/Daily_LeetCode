1class Solution {
2    public int twoCitySchedCost(int[][] arr) {
3        Arrays.sort(arr,(a,b)->Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1]));
4        int p1 = 0;
5        int p2 = 0;
6        int len=arr.length/2;
7        int ans = 0; 
8        for(int i=0;i<arr.length;i++){
9            if(arr[i][0]<arr[i][1] && p1!=len){
10                p1++;
11                ans=ans+arr[i][0];
12            }
13            else if(arr[i][0]<arr[i][1] && p1==len){
14                p2++;
15                ans+=arr[i][1];
16            }
17            else if(arr[i][0]>arr[i][1] && p2!=len){
18                p2++;
19                ans+=arr[i][1];
20            }
21            else{
22                p1++;
23                ans+=arr[i][0];
24            }
25        }
26        return ans;
27    }
28}
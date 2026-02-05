1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int sum  = 0;
4        int ans  = 0;
5        for(int i=0;i<k;i++){
6            sum+=arr[i];
7        }
8        if(sum/k>=threshold){
9            ans++;
10        }
11        int c = 0;
12        for(int i=k;i<arr.length;i++){
13            sum-=arr[c++];
14            sum+=arr[i];
15            if(sum/k>=threshold){
16                ans++;
17            }
18        }
19        return ans;
20    }
21}
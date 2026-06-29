1class Solution {
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        Arrays.sort(arr);
4        arr[0]=1;
5        for(int i=1;i<arr.length;i++){
6            if(arr[i]-arr[i-1]>1){
7                arr[i]=arr[i-1]+1;
8            }
9        }
10        return arr[arr.length-1];
11    }
12}
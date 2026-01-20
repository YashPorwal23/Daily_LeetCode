1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int arr[]= new int[nums.size()];
4        for(int i=0;i<nums.size();i++){
5            for(int j=1;j<=nums.get(i);j++){
6                if((j|(j+1))==nums.get(i)){
7                    arr[i]=j;
8                    break;
9                }
10            }
11            if(arr[i]==0){
12                arr[i]=-1;
13            }
14        }
15        return arr;
16    }
17}
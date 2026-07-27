class Solution {
    public int maxProduct(int[] arr) {
        int max = 0;
        int smax = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax){
                smax=arr[i];
            }
        }
        max--;
        smax--;
        return max*smax;
    }
}
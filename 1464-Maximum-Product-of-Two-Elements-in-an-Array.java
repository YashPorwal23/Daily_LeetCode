class Solution {
    public int maxProduct(int[] arr) {
        int max = 0;
        int smax = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>smax){
                smax=arr[i];
            }
            else if(arr[i]==max){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        max--;
        smax--;
        return max*smax;
    }
}
class Solution {
    public int maxProduct(int n) {
        int temp = n;
        int c=0;
        while(temp!=0){
            c++;
            temp/=10;
        }
        int arr[] = new int[c];
        temp=n;
        c=0;
        while(temp!=0){
            arr[c++]=temp%10;
            temp/=10;
        }
        Arrays.sort(arr);
        return arr[arr.length-2]*arr[arr.length-1];
    }
}
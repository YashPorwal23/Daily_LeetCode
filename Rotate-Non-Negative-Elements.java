1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        int c=0;
4        for(int x:nums){
5            if(x>=0){
6                c++;
7            }
8        }
9        if(c==0) return nums;
10        int temp[] = new int[c];
11        c=0;
12        for(int x:nums){
13            if(x>=0){
14                temp[c++]=x;
15            }
16        }
17        k=k%temp.length;
18        rotate(temp,0,k-1);
19        rotate(temp,k,temp.length-1);
20        rotate(temp,0,temp.length-1);
21        c=0;
22        for(int i=0;i<nums.length;i++){
23            if(nums[i]>=0){
24                nums[i]=temp[c++];
25            }
26        }
27        return nums;
28    }
29    public int[] rotate(int arr[],int st,int end){
30        while(st<end){
31            int temp=arr[st];
32            arr[st]=arr[end];
33            arr[end]=temp;
34            st++;
35            end--;
36        }
37        return arr;
38    }
39}
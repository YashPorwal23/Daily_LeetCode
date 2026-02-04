1class Solution {
2    public int movesToMakeZigzag(int[] nums) {
3        int even = 0;
4        int odd = 0;
5        int temp[]=new int[nums.length];
6        for(int i=0;i<nums.length;i++){
7            temp[i]=nums[i];
8        }
9        for(int i=0;i<temp.length;i+=2){
10            if(i!=0 && temp[i]<=temp[i-1]){
11                even=even+(temp[i-1]-temp[i]+1);
12                temp[i-1]=temp[i]-1;
13            }
14            if(i!=temp.length-1 && temp[i]<=temp[i+1]){
15                even=even+(temp[i+1]-temp[i]+1);
16                temp[i+1]=temp[i]-1;
17            }
18        }
19        for(int i=1;i<nums.length;i+=2){
20            if(nums[i]<=nums[i-1]){
21                odd=odd+(nums[i-1]-nums[i]+1);
22                nums[i-1]=nums[i]-1;
23            }
24            if(i!=nums.length-1 && nums[i]<=nums[i+1]){
25                odd=odd+(nums[i+1]-nums[i]+1);
26                nums[i+1]=nums[i]-1;
27            }
28        }
29        return Math.min(even,odd);
30    }
31}
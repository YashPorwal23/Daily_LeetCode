1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int c = 0;
5            for(int j=i+1;j<nums.length;j++){
6                if(nums[i]%2==0){
7                    if(nums[j]%2!=0){
8                        c++;
9                    }
10                }
11                else{
12                    if(nums[j]%2==0){
13                        c++;
14                    }
15                }
16            }
17            nums[i] = c;
18        }
19        return nums;
20    }
21}
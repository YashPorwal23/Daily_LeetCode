1class Solution {
2    public int numOfPairs(String[] nums, String target) {
3        int count=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=0;j<nums.length;j++){
6                if(i!=j){
7                StringBuilder sb = new StringBuilder(nums[i]);
8                sb.append(nums[j]);
9                if(sb.toString().equals(target)){
10                        count++;
11                    }
12                }
13            }
14        }
15        return count;
16    }
17}
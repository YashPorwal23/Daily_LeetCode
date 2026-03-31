1class Solution {
2    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
3        int ans[] = new int[queries.length];
4        int idx = 0;
5        for(int i=0;i<queries.length;i++){
6            int id = queries[i][1];
7            int val = queries[i][0];
8            int sum = 0;
9            nums[id]+=val;
10            for(int j=0;j<nums.length;j++){
11                if(nums[j]%2==0){
12                    sum+=nums[j];
13                }
14            }
15            ans[idx++] = sum;
16        }
17        return ans;
18    }
19}
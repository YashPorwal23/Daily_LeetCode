1class Solution {
2    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
3        int ans[]=new int[queries.length];
4        List<Integer> temp = new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==x){
7                temp.add(i);
8            }
9        }
10        int c=0;
11        for(int i=0;i<queries.length;i++){
12            if(queries[i]>temp.size()){
13                ans[i]=-1;
14            }
15            else{
16                ans[i]=temp.get(queries[i]-1);
17            }
18        }
19        return ans;
20    }
21}
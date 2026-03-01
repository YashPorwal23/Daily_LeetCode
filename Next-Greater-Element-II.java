1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        ArrayDeque<Integer> st = new ArrayDeque<>();
4        int temp [] = new int[nums.length];
5        int n =  nums.length;
6        for(int i=2*nums.length-1;i>=0;i--){
7            while(!st.isEmpty()&&nums[i%n]>=st.peek()){
8                st.pop();
9            }
10            if(st.isEmpty()){
11                temp[i%n]=-1;
12            }
13            else{
14                temp[i%n]=st.peek();
15            }
16            st.push(nums[i%n]);
17        }
18        return temp;
19    }
20}
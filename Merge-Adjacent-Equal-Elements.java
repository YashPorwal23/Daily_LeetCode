1class Solution {
2    public List<Long> mergeAdjacent(int[] nums) {
3      ArrayDeque<Long> st = new ArrayDeque<>();
4      for(int i=0;i<nums.length;i++){
5        long sum = nums[i];
6        while(!st.isEmpty()&&sum==st.peek()){
7            sum = sum+st.pop();
8        }
9        st.push(sum);
10      }
11      ArrayList<Long> al = new ArrayList<>();
12      while(!st.isEmpty()){
13        al.add(st.pop());
14      }
15      Collections.reverse(al);
16      return al; 
17    }
18}
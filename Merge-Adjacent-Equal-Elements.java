1class Solution {
2    public List<Long> mergeAdjacent(int[] nums) {
3      ArrayDeque<Long> st = new ArrayDeque<>();
4      for(int i=0;i<nums.length;i++){
5        long sum = nums[i];
6        if(st.isEmpty()||sum!=st.peek()){
7            st.push(sum);
8        }
9        else{
10        while(!st.isEmpty()&&sum==st.peek()){
11            sum = sum+st.pop();
12        }
13        st.push(sum);
14      }
15      }
16      ArrayList<Long> al = new ArrayList<>();
17      while(!st.isEmpty()){
18        al.add(st.pop());
19      }
20      Collections.reverse(al);
21      return al; 
22    }
23}
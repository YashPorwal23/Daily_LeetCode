1class Solution {
2    public boolean validateStackSequences(int[] pushed, int[] popped) {
3        ArrayDeque<Integer> st = new ArrayDeque<>();
4        int idx = 0;
5        for(int i=0;i<pushed.length;i++){
6            st.push(pushed[i]);
7            while(!st.isEmpty()&& st.peek()==popped[idx]){
8                st.pop();
9                idx++;
10            }
11        }
12       return st.isEmpty();
13    }
14}
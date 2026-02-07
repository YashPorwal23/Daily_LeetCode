1class Solution {
2    public int minimumDeletions(String s) {
3        ArrayDeque<Character> st = new ArrayDeque<>();
4        int count = 0;
5        for(int i=s.length()-1;i>=0;i--){
6            if(s.charAt(i)=='a'){
7                st.push(s.charAt(i));
8            }
9            else{
10                if(!st.isEmpty()){
11                    count++;
12                    st.pop();
13                }
14            }
15        }
16        return count;
17    }
18}
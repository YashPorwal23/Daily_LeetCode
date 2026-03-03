1class Solution {
2    public boolean isValid(String s) {
3        // Stack<Character> st = new Stack<>();
4        // int c=0;
5        // for(int i=0;i<s.length();i++){
6        //     st.push(s.charAt(i));
7        //     int n = st.size();
8        //     if(n>2){
9        //         if(st.get(n-3)=='a'&&st.get(n-2)=='b'&&st.get(n-1)=='c'){
10        //             st.pop();
11        //             st.pop();
12        //             st.pop();
13        //         }
14        //     }
15        // }
16        // return st.isEmpty();
17        while(s.contains("abc")){
18            s=s.replace("abc","");
19        }
20        return s.length()==0;
21    }
22}
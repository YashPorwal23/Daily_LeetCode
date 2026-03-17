1class Solution {
2    public int[] asteroidCollision(int[] arr) {
3        Stack<Integer> st = new Stack<>();
4        for(int i=0;i<arr.length;i++){
5            if(st.isEmpty()){
6                st.push(arr[i]);
7            }
8            else if(arr[i]>0 && st.peek()>0){
9                st.push(arr[i]);
10            }
11            else if(arr[i]<0 && st.peek()<0){
12                st.push(arr[i]);
13            }
14            else if(arr[i]>0 && st.peek()<0){
15                st.push(arr[i]);
16            }
17            else{
18                boolean chk = false;
19                while((!st.isEmpty()&&st.peek()<=Math.abs(arr[i]))&&(st.peek()>0)){
20                if(st.peek()==Math.abs(arr[i])){
21                    st.pop();
22                    chk=true;
23                    break;
24                }
25                    st.pop();
26                 }
27                 if(!chk &&(st.isEmpty()||st.peek()<0)){
28                    st.push(arr[i]);
29                 }
30            }
31        }
32        int ans[] = new int [st.size()];
33        for(int i=ans.length-1;i>=0;i--){
34            ans[i]=st.pop();
35        }
36        return ans;
37    }
38}
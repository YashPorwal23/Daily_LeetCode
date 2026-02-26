1class Solution {
2    public String reverseByType(String s) {
3        char ch[] = s.toCharArray();
4        int st = 0;
5        int end = ch.length-1;
6        while(st<end){
7            if(Character.isLetter(ch[st])&&Character.isLetter(ch[end])){
8                char c = ch[st];
9                ch[st]=ch[end];
10                ch[end]=c;
11                st++;
12                end--;
13            }
14            else if(Character.isLetter(ch[st])){
15                end--;
16            }
17            else{
18                st++;
19            }
20        }
21        st=0;
22        end=ch.length-1;
23         while(st<end){
24            if(!Character.isLetter(ch[st])&&!Character.isLetter(ch[end])){
25                char c = ch[st];
26                ch[st]=ch[end];
27                ch[end]=c;
28                st++;
29                end--;
30            }
31            else if(!Character.isLetter(ch[st])){
32                end--;
33            }
34            else{
35                st++;
36            }
37        }
38        return new String(ch);
39    }
40}
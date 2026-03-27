1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> al = new ArrayList<>();
4        gen(n,al,"",0,0);
5        return al;
6    }
7    public void gen(int len,List<String> al,String s,int open,int close){
8        if(open==len && close==len){
9            al.add(s);
10            return;
11        }
12        if(open<len){
13        gen(len,al,s+"(",open+1,close);
14        }
15        if(close<open && close<len){
16        gen(len,al,s+")",open,close+1);
17        }
18    }
19}
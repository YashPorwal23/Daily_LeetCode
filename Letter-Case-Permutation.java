1class Solution {
2    public List<String> letterCasePermutation(String s) {
3        List<String> al = new ArrayList<>();
4        gen(s,al,"");
5        return al;
6    }
7    public void gen(String s,List<String> al,String k){
8        if(s.length()==0){
9            al.add(k);
10            return;
11        }
12        char curr = s.charAt(0);
13            if(Character.isDigit(curr)){
14                gen(s.substring(1),al,k+curr);
15            }
16            else{
17                if(Character.isUpperCase(curr)){
18                gen(s.substring(1),al,k+curr);
19                gen(s.substring(1),al,k+(char)(curr+32));
20            }
21            else{
22                gen(s.substring(1),al,k+curr);
23                gen(s.substring(1),al,k+(char)(curr-32));
24            }
25        }
26    }
27}
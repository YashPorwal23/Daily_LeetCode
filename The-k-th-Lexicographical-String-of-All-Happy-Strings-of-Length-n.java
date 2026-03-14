1class Solution {
2    public String getHappyString(int n, int k) {
3        ArrayList<String> al = new ArrayList<>();
4        gen(n,al,"",k);
5        if(al.size()<k){
6            return "";
7        }
8        System.out.println(al);
9        return al.get(k-1);
10    }
11    public void gen(int len,ArrayList<String> al,String s,int k){
12        if(al.size()==k){
13            return;
14        }
15        if(s.length()==len){
16            al.add(s);
17            return;
18        }
19        if(s.length()==0 || s.charAt(s.length()-1)!='a'){
20        gen(len,al,s+"a",k);
21        }
22        if(s.length()==0 || s.charAt(s.length()-1)!='b'){
23        gen(len,al,s+"b",k);
24        }
25        if(s.length()==0 || s.charAt(s.length()-1)!='c'){
26        gen(len,al,s+"c",k);
27        }
28    }
29}
1class Solution {
2    public int vowelConsonantScore(String s) {
3       int v = 0;
4       int c = 0;
5       for(int i=0;i<s.length();i++){
6        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
7            v++;
8        }
9        else if(Character.isLetter(s.charAt(i))){
10            c++;
11        }
12       }
13       if(c==0||v==0) return 0;
14       return (int)Math.floor(v/c); 
15    }
16}
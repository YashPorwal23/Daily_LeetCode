1class Solution {
2    public boolean checkOnesSegment(String s) {
3        int c= 0;
4        for(int i=0;i<s.length();i++){
5            if(i<s.length()-1&&(s.charAt(i)=='1'&&s.charAt(i+1)=='1')&&c==0){
6                continue;
7            }
8            else if(s.charAt(i)=='1'&&c>0){
9                return false;
10            }
11            else if(s.charAt(i)=='1'&&c==0){
12                c=1;
13            }
14        }
15        return true;
16    }
17}
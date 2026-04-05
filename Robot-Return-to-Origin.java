1class Solution {
2    public boolean judgeCircle(String moves) {
3        int c1=0;
4        int c2=0;
5        for(int i=0;i<moves.length();i++){
6            if(moves.charAt(i)=='L'){
7                c1++;
8            }
9            else if(moves.charAt(i)=='R'){
10                c1--;
11            }
12            else if(moves.charAt(i)=='U'){
13                c2++;
14            }
15            else{
16                c2--;
17            }
18        }
19        return c1==0 && c2==0;
20    }
21}
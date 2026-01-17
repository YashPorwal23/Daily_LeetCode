1class Solution {
2    public String addSpaces(String s, int[] spaces) {
3        StringBuilder sb = new StringBuilder();
4        int c=0;
5        for(int i=0;i<s.length();i++){
6            if(c<spaces.length && i==spaces[c]){
7                sb.append(" ");
8                c++;
9            }
10            sb.append(s.charAt(i));
11        }
12        return sb.toString();
13    }
14}
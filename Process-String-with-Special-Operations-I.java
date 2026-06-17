1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            char ch = s.charAt(i);
6            if(Character.isLowerCase(ch)){
7            sb.append(ch);
8            }
9            else if(ch=='#'){
10                String k = sb.substring(0,sb.length());
11                sb.append(k);
12            }
13            else if(ch=='%'){
14                sb.reverse();
15            }
16            else{
17                if(sb.length()>0){
18                sb.deleteCharAt(sb.length()-1);
19                }
20            }
21        }
22        return sb.toString();
23    }
24}